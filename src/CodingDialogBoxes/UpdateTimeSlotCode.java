package CodingDialogBoxes;

import CodingInterfaces.CommonDBOperations;
import CodingInterfaces.DBConnectivity;
import java.sql.Connection;
import java.sql.Statement;

public class UpdateTimeSlotCode {
    public boolean isTimeSlotPossible(String consultantId, String day, String startingTime, String endingTime, String roomNo, int timeSlotID) throws Exception{
        boolean isPossible=true;
        
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        String query="SELECT time_slot_id\n" +
                    "FROM time_slot \n" +
                    "WHERE (room_no="+roomNo+" AND day='"+day+"') AND ((starting_time<='"+startingTime+"' AND ending_time>='"+startingTime+"') OR (starting_time<='"+endingTime+"' AND ending_time>='"+endingTime+"')) AND (time_slot_id!="+timeSlotID+";";
        
        CommonDBOperations cdb=new CommonDBOperations();
        int count=cdb.countRecordsInTable(query);
        
        if(count!=0){
            isPossible=false;
        }
        
        c.close();
        
        return isPossible;
    }
    
    public void updateTimeSlot(String consultantID, int timeSlotID, String currentPatients, String day, String startingTime, String endingTime, String maxPatients, String roomNo) throws Exception{
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        String query="UPDATE time_slot\n" +
                    "SET consultant_id='"+consultantID+"', day='"+day+"', starting_time='"+startingTime+"', ending_time='"+endingTime+"', current_patient="+currentPatients+", max_patient="+maxPatients+", room_no="+roomNo+"\n" +
                    "WHERE time_slot_id="+timeSlotID+";";
        
        stmt.executeUpdate(query);
        
        c.close();
    }
}
