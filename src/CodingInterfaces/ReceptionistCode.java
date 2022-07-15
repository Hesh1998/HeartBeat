// Code related to operations used in Receptionist Interface

package CodingInterfaces;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReceptionistCode {
    
    // 1) Coding related to Dashboard Panel of Receptionist Interface
    
    // Returns numbers and figures related to dashboard
    public int[] handleDashboard()throws Exception{  
        String query1="SELECT * FROM patient ORDER BY patient_code ASC;";
        String query2="SELECT * FROM consultant_room ORDER BY room_no ASC;";
        String query3="SELECT * FROM consultant ORDER BY consultant_id ASC;";
        String query4="SELECT * FROM appointment ORDER BY appointment_no ASC;";
        
        int count[]=new int[4];
        CommonDBOperations commonObj=new CommonDBOperations();
        count[0]=commonObj.countRecordsInTable(query1);
        count[1]=commonObj.countRecordsInTable(query2);
        count[2]=commonObj.countRecordsInTable(query3);
        count[3]=commonObj.countRecordsInTable(query4);
        
        return count;
    }
    
    
    // 2) Coding related to Register Patient Panel of Receptionist Interface
    
    // Returns the list of available consultant specialities as stored in the database
    public String[] RegisterPatientGetConsultantSpecialityList() throws Exception{
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        CommonDBOperations commonObj=new CommonDBOperations();
        int count=commonObj.countRecordsInTable("SELECT * FROM consultant_salary ORDER BY speciality ASC;");
        String specialityList[]=new String[count];
        
        String query="SELECT speciality FROM consultant_salary ORDER BY speciality ASC;";
        
        ResultSet rs=stmt.executeQuery(query);
        
        int i=0;
        while(rs.next()){
            specialityList[i]=rs.getString("speciality");
            i++;
        }
        
        c.close();
        
        return specialityList;
    }
    
    
    // Returns the available consultant name list (forename and surname) under a selected speciality
    // accepts consultant speciality as a parameter
    public String[] RegisterPatientGetConsultantNameList(String speciality) throws Exception{
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        CommonDBOperations commonObj=new CommonDBOperations();
        int count=commonObj.countRecordsInTable("SELECT * FROM consultant WHERE speciality='"+speciality+"' ORDER BY speciality;");
        String[] consultantNameList=new String[count];
        
        String query="SELECT forename, surname FROM consultant WHERE speciality='"+speciality+"' ORDER BY forename ASC, surname ASC;";
        
        ResultSet rs=stmt.executeQuery(query);
        
        int i=0;
        while(rs.next()){
            consultantNameList[i]=("Dr. "+rs.getString("forename")+" "+rs.getString("surname"));
            i++;
        }
        
        c.close();
        
        return consultantNameList;
    }
    
    
    // Returns the available consultant id list under a selected speciality
    // accepts consultant speciality as a parameter
    public String[] RegisterPatientGetConsultantIDList(String speciality) throws Exception{
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        CommonDBOperations commonObj=new CommonDBOperations();
        int count=commonObj.countRecordsInTable("SELECT * FROM consultant WHERE speciality='"+speciality+"' ORDER BY speciality;");
        String[] consultantIDList=new String[count];
        
        String query="SELECT consultant_id FROM consultant WHERE speciality='"+speciality+"' ORDER BY forename ASC, surname ASC;";
        
        ResultSet rs=stmt.executeQuery(query);
        
        int i=0;
        while(rs.next()){
            consultantIDList[i]=rs.getString("consultant_id");
            i++;
        }
        
        c.close();
         
        return consultantIDList;
    }
    
    
    // accepts consultant ID as a parameter
    // returns all available time slots for a specific consultant(consultant ID)
    // but only the vacant time slots are returned(current patients < maximum patients)
    public String[] RegisterPatientGetDateAndTimeList(String consultantID) throws Exception{
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        CommonDBOperations commonObj=new CommonDBOperations();
        int count=commonObj.countRecordsInTable("SELECT * FROM time_slot WHERE consultant_id='"+consultantID+"';");
        String[] dateAndTimeList=new String[count];
        
        String query=("SELECT day, starting_time, room_no FROM time_slot WHERE consultant_id='"+consultantID+"' AND current_patient<max_patient \n" +
                        "ORDER BY \n" +
                        "     CASE\n" +
                        "          WHEN Day = 'Monday' THEN 1\n" +
                        "          WHEN Day = 'Tuesday' THEN 2\n" +
                        "          WHEN Day = 'Wednesday' THEN 3\n" +
                        "          WHEN Day = 'Thursday' THEN 4\n" +
                        "          WHEN Day = 'Friday' THEN 5\n" +
                        "          WHEN Day = 'Saturday' THEN 6\n" +
                        "          WHEN Day = 'Sunday' THEN 7\n" +
                        "     END ASC");
        
        ResultSet rs=stmt.executeQuery(query);
        
        int i=0;
        while(rs.next()){
            dateAndTimeList[i]=(rs.getString("day")+" at "+rs.getString("starting_time")+", Assigned Room No : "+rs.getString("room_no"));
            i++;
        }
        
        c.close();
        
        return dateAndTimeList;
    }
    
    
    // returns generated patient_code and appointment_no(for the next record)
    // related to a newly registered patient
    public String[] RegisterPatientGetGeneratedCodes() throws Exception{
        String codes[]=new String[2];
        String query1="SELECT patient_code FROM patient ORDER BY patient_code ASC;";
        String query2="SELECT appointment_no FROM appointment ORDER BY appointment_no ASC;";
        
        CommonDBOperations commonObj=new CommonDBOperations();
        codes[0]=commonObj.getNextPrimaryKey("P", query1, "patient_code");
        codes[1]=commonObj.getNextPrimaryKey("", query2, "appointment_no");
        
        return codes;
    }
    
    
    // Generates the details related to the appointment receipt of a patient's appointment 
    // and returns it as a String
    public String RegisterPatientGetAppointmentReceipt(String patientCode, String patientName, String appointmentNo, String consultantSpeciality, 
            String consultantName, String dateTimeAndRoomNo, String currentDate, String paymentDate) throws Exception{
        String day1[]=currentDate.split(", ");
        String day1Arg=day1[0];
        String day2[]=dateTimeAndRoomNo.split(" ");
        String day2Arg="";
        for(int i=0; i<3; i++){
            day2Arg=day2Arg+day2[0].charAt(i);
        }
        
        String paymentStatus=null;
        if(!(paymentDate.equals(""))){
            paymentStatus="Paid";
        }else{
            paymentStatus="Not Paid";
        }
        
        CommonOperations co=new CommonOperations();
        String appointmentDate=co.getDate(currentDate, day1Arg, day2Arg);
        String appointmentTime=day2[2].replace(",", "");
        String appointmentDateAndTime=(appointmentDate+" at "+appointmentTime);
                
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        
        String query1="SELECT * FROM medical_center_branch WHERE branch_no='B1';";
        ResultSet rs1=stmt.executeQuery(query1);
        rs1.next();
        String receipt2=(rs1.getString("branch_name")+"\n"+rs1.getString("address_number")+", "+rs1.getString("address_street")+", "+rs1.getString("address_city")+".\n");
        
        String query2="SELECT contact_no FROM medical_center_branch_contact_number WHERE branch_no='B1';";
        CommonDBOperations commonObj=new CommonDBOperations();
        int count=commonObj.countRecordsInTable(query2);
        String[] contacts=new String[count];
        ResultSet rs2=stmt.executeQuery(query2);
        String receipt3="Tel : ";
        while(rs2.next()){
            receipt3=receipt3.concat(rs2.getString("contact_no")+"    ");
        }
        
        String query3="SELECT charge_per_patient FROM consultant_salary WHERE speciality='"+consultantSpeciality+"';";
        ResultSet rs3=stmt.executeQuery(query3);
        rs3.next();
        String receipt1Part2="\nAppointment Charge : Rs. "+rs3.getString("charge_per_patient")+" ("+paymentStatus+")";
        
        String details[]=dateTimeAndRoomNo.split(", ");
        String receipt0="========================================================================================";
        String receipt1=("Patient Code : "+patientCode+"\nPatient Name : "+patientName+"\nAppointment No : "+appointmentNo+"\nConsultant : "+consultantName+"\nConsultant Speciality : "+consultantSpeciality+"\nDate and Time : "+appointmentDateAndTime+"\n"+details[1]+receipt1Part2+"\n");
        
        
        c.close();
        
        return (receipt0+"\n"+receipt1+"\n"+receipt2+receipt3+"\n"+receipt0);
        
    }
    
    
    // returns the relevant timeslot_id when the related starting time, date and room no number is passed as parameters
    // the data is accepted as a single string
    // useful in entering data to timeslots table in the database
    public int RegisterPatientGetTimeSlotID(String dateTimeAndRoomNo) throws Exception{
        int timeSlotID=0;
        String splitted[]=dateTimeAndRoomNo.split(" ");
        String day=splitted[0];
        String startingTime=splitted[2].replace(",", "");
        String roomNo=splitted[7];
        
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        String query="SELECT time_slot_id FROM time_slot WHERE (day='"+day+"' AND starting_time='"+startingTime+"' AND room_no="+roomNo+");";
        ResultSet rs=stmt.executeQuery(query);
        rs.next();
        timeSlotID=rs.getInt("time_slot_id");
        
        c.close();
        
        return timeSlotID;
    }
    
    
    // Handles the record insertion and updation to the database related to a new patient registration
    // a new record is inserted to patient table and appointment table
    // and the current patient count of the relevant timeslot in the timeslot table is incremented by 1
    public void RegisterPatientRegistration(String patientCode, String forename, String surname, String gender, String dateOfBirth, String bloodGroup, String nic, String email, String mobileNo, String LANNo, String addressNumber, String addressStreet, String addressCity, int appointmentNo, int timeSlotID, String paymentDate) throws Exception{
        CommonOperations co=new CommonOperations();
        dateOfBirth=co.convertDateToDatabase(dateOfBirth);
        
        if(nic.length()==10 && nic.charAt(9)=='v'){
            nic=nic.replace("v", "V");
        }
        
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        String query1="INSERT INTO patient VALUES('"+patientCode+"', '"+forename+"', '"+surname+"', '"+addressNumber+"', '"+addressStreet+"', '"+addressCity+"', '"+dateOfBirth+"', '"+gender+"', '"+bloodGroup+"', '"+nic+"', '"+email+"', '"+mobileNo+"', '"+LANNo+"');";
        String query2=null;
        if(paymentDate.equals("")){
            query2="INSERT INTO appointment VALUES("+appointmentNo+", '"+patientCode+"', "+timeSlotID+", NULL);";
        }else{
            query2="INSERT INTO appointment VALUES("+appointmentNo+", '"+patientCode+"', "+timeSlotID+", '"+paymentDate+"');";
        }
        String query3="UPDATE time_slot SET current_patient=current_patient+1 WHERE time_slot_id="+timeSlotID+";";
        stmt.executeUpdate(query1);
        stmt.executeUpdate(query2);
        stmt.executeUpdate(query3);
        
        c.close();
    }
    
    
    // 3) Coding related to Update Patient Panel of Receptionist Interface
    
    // Returns all the personal details related to the searched patient code
    // only accepts valid patient codes
    // must verify patient code before sendig as an argument to this method
    public String[] UpdatePatientGetSearchPatientDetails(String patientCode) throws Exception{
        String data[]=new String[13];
        
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        String query="SELECT patient_code, forename, surname, gender, date_of_birth, blood_group, NIC, email, mobile_no, LAN_no, address_number, address_street, address_city FROM patient WHERE patient_code='"+patientCode+"';";
        ResultSet rs=stmt.executeQuery(query);
        rs.next();
        data[0]=rs.getString("patient_code");
        data[1]=rs.getString("forename");
        data[2]=rs.getString("surname");
        data[3]=rs.getString("gender");
        data[4]=rs.getString("date_of_birth");
        data[5]=rs.getString("blood_group");
        data[6]=rs.getString("NIC");
        data[7]=rs.getString("email");
        data[8]=rs.getString("mobile_no");
        data[9]=rs.getString("LAN_no");
        data[10]=rs.getString("address_number");
        data[11]=rs.getString("address_street");
        data[12]=rs.getString("address_city");
        
        c.close();
        
        return data;
    }
    
    
    // Handles record updation related to an existing patient record in the patient table(only personal details)
    public void UpdatePatientUpdation(String patientCode, String forename, String surname, String gender, String dateOfBirth, String bloodGroup, String nic, String email, String mobileNo, String LANNo, String addressNumber, String addressStreet, String addressCity) throws Exception{
        CommonOperations co=new CommonOperations();
        dateOfBirth=co.convertDateToDatabase(dateOfBirth);
        
        if(nic.length()==10 && nic.charAt(9)=='v'){
            nic=nic.replace("v", "V");
        }
        
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        String query=("UPDATE patient\n" +
                        "SET \n" +
                        "	forename='"+forename+"',\n" +
                        "    surname='"+surname+"',\n" +
                        "    address_number='"+addressNumber+"',\n" +
                        "    address_street='"+addressStreet+"',\n" +
                        "    address_city='"+addressCity+"',\n" +
                        "    date_of_birth='"+dateOfBirth+"',\n" +
                        "    gender='"+gender+"',\n" +
                        "    blood_group='"+bloodGroup+"',\n" +
                        "    NIC='"+nic+"',\n" +
                        "    email='"+email+"',\n" +
                        "    mobile_no='"+mobileNo+"',\n" +
                        "    LAN_no='"+LANNo+"'\n" +
                        "WHERE patient_code='"+patientCode+"';");
        
        
        stmt.executeUpdate(query);
        
        c.close();
    }
    
    // returns the details related to Appointment Table in Patient Update panel
    public String[][] UpdatePatientGetAppointmentDetailsTable(String patientCode, String currentDate) throws Exception{
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        String query=("SELECT a.appointment_no, a.payment_date, c.speciality, c.forename, c.surname, t.day, t.starting_time, t.room_no\n" +
                    "FROM appointment a, consultant c, time_slot t\n" +
                    "WHERE a.patient_code='"+patientCode+"' AND a.time_slot_id=t.time_slot_id AND t.consultant_id=c.consultant_id\n" +
                    "ORDER BY a.appointment_no;");
        
        CommonDBOperations cdb=new CommonDBOperations();
        int count=cdb.countRecordsInTable(query);
        String table[][]=new String[count][7];
        
        ResultSet rs=stmt.executeQuery(query);
        int i=0;
        while(rs.next()){
            table[i][0]=rs.getString("appointment_no");
            table[i][1]="Dr. "+rs.getString("forename")+" "+rs.getString("surname");
            table[i][2]=rs.getString("speciality");
            table[i][3]=rs.getString("day");
            table[i][4]=rs.getString("starting_time");
            table[i][5]=rs.getString("room_no");
            table[i][6]=rs.getString("payment_date");
            
            i++;
        }
        
        String day1[]=currentDate.split(", ");
        String day1Arg=day1[0];
        
        CommonOperations co=new CommonOperations();
        
        
        for(int j=0; j<count; j++){
            if(!(table[j][6]==null)){
                table[j][6]="Paid";
            }else{
                table[j][6]="Not Paid";
            }
           
            String day2Arg="";
            for(int k=0; k<3; k++){
                day2Arg=day2Arg+table[j][3].charAt(k);
            }
            table[j][3]=co.getDate(currentDate, day1Arg, day2Arg);
        }
        
        c.close();
        
        return table;
    }
    
    
    // deletion process of an appointment
    public void UpdatePatientDeleteAppointment(int appointmentNo) throws Exception{
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        String patientCode=null;
        int timeSlotID=0;
        
        String query1="SELECT * FROM appointment WHERE appointment_no='"+appointmentNo+"';";
        ResultSet rs1=stmt.executeQuery(query1);
        rs1.next();
        patientCode=rs1.getString("patient_code");
        timeSlotID=rs1.getInt("time_slot_id");
        
        String query4="SELECT * FROM appointment WHERE patient_code='"+patientCode+"';";
        CommonDBOperations cdb=new CommonDBOperations();
        int count=cdb.countRecordsInTable(query4);
        
        String query2="DELETE FROM appointment WHERE appointment_no="+appointmentNo+";";
        stmt.executeUpdate(query2);
        
        if(count==1){
            String query5="DELETE FROM patient WHERE patient_code='"+patientCode+"';";
            stmt.executeUpdate(query5);
        }
        
        String query3="UPDATE time_slot SET current_patient=current_patient-1 WHERE time_slot_id="+timeSlotID+";";
        stmt.executeUpdate(query3);
        
        c.close();
    }
    
    
    // returns consultant details related to consultants table in Consultants panel
    public String[][] ConsultantGetConsultantDetailsTableFullOrSearched(String status, String consultantID) throws Exception{
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        String query=null;
        if(status.equals("Full")){
            query="SELECT c.consultant_id, c.forename, c.surname, c.speciality, c.email, cs.charge_per_patient, c.mobile_no, c.LAN_no \n" +
                    "FROM consultant c, consultant_salary cs\n" +
                    "WHERE c.speciality=cs.speciality\n" +
                    "ORDER BY c.consultant_id ASC;";    
        }else{
            query="SELECT c.consultant_id, c.forename, c.surname, c.speciality, c.email, cs.charge_per_patient, c.mobile_no, c.LAN_no \n" +
                    "FROM consultant c, consultant_salary cs\n" +
                    "WHERE c.speciality=cs.speciality AND c.consultant_id='"+consultantID+"'\n" +
                    "ORDER BY c.consultant_id ASC;";  
        }
        
        
        CommonDBOperations cdb=new CommonDBOperations();
        int count=cdb.countRecordsInTable(query);
        String table[][]=new String[count][7];
        
        ResultSet rs=stmt.executeQuery(query);
        int i=0;
        while(rs.next()){
            table[i][0]=rs.getString("consultant_id");
            table[i][1]="Dr. "+rs.getString("forename")+" "+rs.getString("surname");
            table[i][2]=rs.getString("speciality");
            table[i][3]=rs.getString("email");
            table[i][4]=rs.getString("charge_per_patient");
            table[i][5]=rs.getString("mobile_no");
            table[i][6]=rs.getString("LAN_no");
            
            i++;
        }
        
        c.close();
        
        return table;
    }
    
    // returns time slot details related to time slots table in Consultants panel
    public String[][] ConsultantGetTimeSlotDetailsTableFullOrSearched(String day, String status, String consultantID) throws Exception{
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        String query=null;
        if(status.equals("Full")){
            if(day.equals("All Timeslots")){
                query="SELECT t.day, t.starting_time, t.ending_time, c.forename, c.surname, t.room_no, t.max_patient, t.current_patient\n" +
                        "FROM time_slot t, consultant c\n" +
                        "WHERE t.consultant_id=c.consultant_id\n" +
                        "ORDER BY \n" +
                        "     CASE\n" +
                        "          WHEN Day = 'Sunday' THEN 7\n" +
                        "          WHEN Day = 'Monday' THEN 1\n" +
                        "          WHEN Day = 'Tuesday' THEN 2\n" +
                        "          WHEN Day = 'Wednesday' THEN 3\n" +
                        "          WHEN Day = 'Thursday' THEN 4\n" +
                        "          WHEN Day = 'Friday' THEN 5\n" +
                        "          WHEN Day = 'Saturday' THEN 6\n" +
                        "     END ASC, starting_time ASC;";
            }else{
                query="SELECT t.day, t.starting_time, t.ending_time, c.forename, c.surname, t.room_no, t.max_patient, t.current_patient\n" +
                        "FROM time_slot t, consultant c\n" +
                        "WHERE t.consultant_id=c.consultant_id AND day='"+day+"'\n" +
                        "ORDER BY \n" +
                        "     CASE\n" +
                        "          WHEN Day = 'Sunday' THEN 7\n" +
                        "          WHEN Day = 'Monday' THEN 1\n" +
                        "          WHEN Day = 'Tuesday' THEN 2\n" +
                        "          WHEN Day = 'Wednesday' THEN 3\n" +
                        "          WHEN Day = 'Thursday' THEN 4\n" +
                        "          WHEN Day = 'Friday' THEN 5\n" +
                        "          WHEN Day = 'Saturday' THEN 6\n" +
                        "     END ASC, starting_time ASC;";
            }   
        }else{
            if(day.equals("All Timeslots")){
                query="SELECT t.day, t.starting_time, t.ending_time, c.forename, c.surname, t.room_no, t.max_patient, t.current_patient\n" +
                        "FROM time_slot t, consultant c\n" +
                        "WHERE t.consultant_id=c.consultant_id AND c.consultant_id='"+consultantID+"'\n" +
                        "ORDER BY \n" +
                        "     CASE\n" +
                        "          WHEN Day = 'Sunday' THEN 7\n" +
                        "          WHEN Day = 'Monday' THEN 1\n" +
                        "          WHEN Day = 'Tuesday' THEN 2\n" +
                        "          WHEN Day = 'Wednesday' THEN 3\n" +
                        "          WHEN Day = 'Thursday' THEN 4\n" +
                        "          WHEN Day = 'Friday' THEN 5\n" +
                        "          WHEN Day = 'Saturday' THEN 6\n" +
                        "     END ASC, starting_time ASC;";
            }else{
                query="SELECT t.day, t.starting_time, t.ending_time, c.forename, c.surname, t.room_no, t.max_patient, t.current_patient\n" +
                        "FROM time_slot t, consultant c\n" +
                        "WHERE t.consultant_id=c.consultant_id AND day='"+day+"' AND c.consultant_id='"+consultantID+"'\n" +
                        "ORDER BY \n" +
                        "     CASE\n" +
                        "          WHEN Day = 'Sunday' THEN 7\n" +
                        "          WHEN Day = 'Monday' THEN 1\n" +
                        "          WHEN Day = 'Tuesday' THEN 2\n" +
                        "          WHEN Day = 'Wednesday' THEN 3\n" +
                        "          WHEN Day = 'Thursday' THEN 4\n" +
                        "          WHEN Day = 'Friday' THEN 5\n" +
                        "          WHEN Day = 'Saturday' THEN 6\n" +
                        "     END ASC, starting_time ASC;";
            } 
        }
        
        
        CommonDBOperations cdb=new CommonDBOperations();
        int count=cdb.countRecordsInTable(query);
        String table[][]=new String[count][7];
        
        ResultSet rs=stmt.executeQuery(query);
        int i=0;
        while(rs.next()){
            table[i][0]=rs.getString("day");
            table[i][1]=rs.getString("starting_time");
            table[i][2]=rs.getString("ending_time");
            table[i][3]="Dr. "+rs.getString("forename")+" "+rs.getString("surname");
            table[i][4]=rs.getString("room_no");
            table[i][5]=rs.getString("max_patient");
            table[i][6]=rs.getString("current_patient");
            
            i++;
        }
        
        c.close();
        
        return table;
    }
    
    // deletion method for timeslot
    public void ConsultantDeleteTimeSlot(int timeSlotID) throws Exception{
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        String query="DELETE FROM time_slot WHERE time_slot_id="+timeSlotID+";";
        
        stmt.executeUpdate(query);
        c.close();
    }
}
