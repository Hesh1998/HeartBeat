package CodingDialogBoxes;

import CodingInterfaces.CommonOperations;
import CodingInterfaces.DBConnectivity;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateAppointmentCode {
    public void UpdateAppointment(String patientCode, int appointmentNo, int newTimeSlotID, String paymentDate) throws Exception{
        CommonOperations co=new CommonOperations();
        
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        String query1="SELECT * FROM appointment WHERE appointment_no='"+appointmentNo+"';";
        ResultSet rs=stmt.executeQuery(query1);
        rs.next();
        int oldTimeSlotID=rs.getInt("time_slot_id");
        
        
        String query2=null;
        if(paymentDate.equals("")){
            query2="UPDATE appointment \n" +
                    "	SET patient_code='"+patientCode+"',\n" +
                    "    time_slot_id="+newTimeSlotID+",\n" +
                    "    payment_date=NULL\n" +
                    "WHERE appointment_no="+appointmentNo+";";
        }else{
            query2="UPDATE appointment \n" +
                    "	SET patient_code='"+patientCode+"',\n" +
                    "    time_slot_id="+newTimeSlotID+",\n" +
                    "    payment_date='"+paymentDate+"'\n" +
                    "WHERE appointment_no="+appointmentNo+";";
        }
        stmt.executeUpdate(query2);
        
        String query3="UPDATE time_slot SET current_patient=current_patient+1 WHERE time_slot_id="+newTimeSlotID+";";
        String query4="UPDATE time_slot SET current_patient=current_patient-1 WHERE time_slot_id="+oldTimeSlotID+";";
        stmt.executeUpdate(query3);
        stmt.executeUpdate(query4);
        
        c.close();
    }
    
    public String[] isPaymentDone(int appointmentNo) throws Exception{
        String isPaymentDoneVar[]={"false", null};
        
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        String query="SELECT payment_date FROM appointment WHERE appointment_no='"+appointmentNo+"';";
        ResultSet rs=stmt.executeQuery(query);
        rs.next();
        String paymentDate=rs.getString("payment_date");
        
        if(paymentDate!=null){
            isPaymentDoneVar[0]="true";
            isPaymentDoneVar[1]=paymentDate;
        }
        
        c.close();
        
        return isPaymentDoneVar;
    }
}
