package CodingDialogBoxes;

import CodingInterfaces.CommonOperations;
import CodingInterfaces.DBConnectivity;
import java.sql.Connection;
import java.sql.Statement;


public class AddAppointmentCode {
    public void AddNewAppointment(String patientCode, int appointmentNo, int timeSlotID, String paymentDate) throws Exception{
        CommonOperations co=new CommonOperations();
        
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
       
        String query2=null;
        if(paymentDate.equals("")){
            query2="INSERT INTO appointment VALUES("+appointmentNo+", '"+patientCode+"', "+timeSlotID+", NULL);";
        }else{
            query2="INSERT INTO appointment VALUES("+appointmentNo+", '"+patientCode+"', "+timeSlotID+", '"+paymentDate+"');";
        }
        String query3="UPDATE time_slot SET current_patient=current_patient+1 WHERE time_slot_id="+timeSlotID+";";
        stmt.executeUpdate(query2);
        stmt.executeUpdate(query3);
        
        c.close();
    }
}
