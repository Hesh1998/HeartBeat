package CodingInterfaces;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConsultantCode {
    // 1) Coding related to Dashboard Panel of Consultant Interface
    
    // Returns numbers and figures related to dashboard
    public int[] handleDashboard(String currentDate, String condultantID)throws Exception{  
        String date[]=currentDate.split(", ");
        String day=date[0];
        day=day.toUpperCase();
        switch(day){
            case "MON" : day="Monday"; break;
            case "TUE" : day="Tuesday"; break;
            case "WED" : day="Wednesday"; break;
            case "THU" : day="Thursday"; break;
            case "FRI" : day="Friday"; break;
            case "SAT" : day="Saturday"; break;
            case "SUN" : day="Sunday"; break;
        }
        
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        int count[]={0, 0};
        
        String query1="SELECT SUM(current_patient) AS sum FROM time_slot WHERE consultant_id='"+condultantID+"';";
        String query2="SELECT SUM(current_patient) AS sum FROM time_slot WHERE consultant_id='"+condultantID+"' AND day='"+day+"';";
        
        ResultSet rs1=stmt.executeQuery(query1);
        rs1.next();
        count[0]=rs1.getInt("sum");
        
        ResultSet rs2=stmt.executeQuery(query2);
        rs2.next();
        count[1]=rs2.getInt("sum");
        
        c.close();
        
        return count;
    }
    
    public String[][] DashboardGetTimeSlotDetailsTable(String consultantID, String day) throws Exception{
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        String query=null;
        
        if(day.equals("All Time Slots")){
            query="SELECT day, consultant_id, starting_time, ending_time, room_no, max_patient, current_patient FROM time_slot WHERE consultant_id='"+consultantID+"'\n"+
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
            query="SELECT day, consultant_id, starting_time, ending_time, room_no, max_patient, current_patient FROM time_slot WHERE consultant_id='"+consultantID+"' AND day='"+day+"'\n"+
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
        
        CommonDBOperations commonObj=new CommonDBOperations();
        int count=commonObj.countRecordsInTable(query);
        String table[][]=new String[count][6];
        
        ResultSet rs=stmt.executeQuery(query);
        int i=0;
        while(rs.next()){
            table[i][0]=rs.getString("day");
            table[i][1]=rs.getString("starting_time");
            table[i][2]=rs.getString("ending_time");
            table[i][3]=rs.getString("room_no");
            table[i][4]=rs.getString("max_patient");
            table[i][5]=rs.getString("current_patient");
            
            i++;
        }
        
        c.close();
        
        return table;
    }
    
    
    public String[] getAppointmentDetails(String appointmentNo) throws Exception{
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        String query="SELECT a.appointment_no, p.forename, p.surname, p.blood_group, p.gender, p.date_of_birth, a.payment_date, a.patient_code\n" +
                        "FROM appointment a, patient p\n" +
                        "WHERE a.patient_code=p.patient_code AND appointment_no="+appointmentNo+";";
        
        
        ResultSet rs=stmt.executeQuery(query);
        rs.next();
        
        String details[]=new String[7];
        
        details[0]=rs.getString("appointment_no");
        details[1]=rs.getString("forename")+" "+rs.getString("surname");
        details[2]=rs.getString("blood_group");
        details[3]=rs.getString("gender");
        details[4]=rs.getString("date_of_birth");
        details[5]=rs.getString("payment_date");
        details[6]=rs.getString("patient_code");
        
        if(details[5]==null){
            details[5]="Not Paid";
        }else{
            details[5]="Paid";
        }
        CommonOperations co=new CommonOperations();
        details[4]=Integer.toString(co.getAgeFromDOB(details[4]));
        
        c.close();
        
        return details;
    }
    
    public String[][] DashboardGetPrescriptionHistoryTable(String consultantID, String patientCode) throws Exception{
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        String query="SELECT p.prescription_no, diagnosed_illness, drug_prescribed, dose\n" +
                        "FROM prescription p, prescription_drug_prescribed pd\n" +
                        "WHERE patient_code='"+patientCode+"' AND consultant_id='"+consultantID+"' AND p.prescription_no=pd.prescription_no;";
        
        CommonDBOperations cdb=new CommonDBOperations();
        int count=cdb.countRecordsInTable(query);
        String table[][]=new String[count][4];
        
        ResultSet rs=stmt.executeQuery(query);
        int i=0;
        while(rs.next()){
            table[i][0]=rs.getString("prescription_no");
            table[i][1]=rs.getString("diagnosed_illness");
            table[i][2]=rs.getString("drug_prescribed");
            table[i][3]=rs.getString("dose");
            
            i++;
        }
        
        c.close();
        
        return table;
        
    }
    
    
    public void Prescribe(String patientCode, String consultantID, String prescriptionNo, String diagnosedIllness, String note, String drugAndDose[][], String status, int countOfDrugs, int appointmentNo) throws Exception{
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        if(status.equals("Yes")){
            String query1="INSERT INTO prescription VALUES("+prescriptionNo+", '"+patientCode+"', '"+diagnosedIllness+"', '"+note+"', '"+consultantID+"');";
            stmt.executeUpdate(query1);
            for(int i=0; i<countOfDrugs; i++){
                String query2="INSERT INTO prescription_drug_prescribed VALUES("+prescriptionNo+", '"+drugAndDose[i][0]+"', '"+drugAndDose[i][1]+"');";
                stmt.executeUpdate(query2);
            }
        }else{
            String query1="DELETE FROM prescription_drug_prescribed WHERE prescription_no IN (SELECT prescription_no FROM prescription WHERE patient_code='"+patientCode+"' AND consultant_id='"+consultantID+"');";
            String query2="DELETE FROM prescription WHERE patient_code='"+patientCode+"' AND consultant_id='"+consultantID+"';";
            
            stmt.executeUpdate(query1);
            stmt.executeUpdate(query2);
        }
        
        ConsultantCode cd=new ConsultantCode();
        cd.TreatPatientDeleteAppointment(appointmentNo, status);
        c.close();
    }
    
    public void TreatPatientDeleteAppointment(int appointmentNo, String status) throws Exception{
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
        
        
        String query3="UPDATE time_slot SET current_patient=current_patient-1 WHERE time_slot_id="+timeSlotID+";";
        stmt.executeUpdate(query3);
        
        c.close();
    }
}
