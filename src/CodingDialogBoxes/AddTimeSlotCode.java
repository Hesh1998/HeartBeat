package CodingDialogBoxes;

import CodingInterfaces.CommonDBOperations;
import CodingInterfaces.DBConnectivity;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddTimeSlotCode {
    public String[] getRoomNoList() throws Exception{
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        String query="SELECT * FROM consultant_room;";
        
        CommonDBOperations cdb=new CommonDBOperations();
        int count=cdb.countRecordsInTable(query);
        String roomNoList[]=new String[count];
        
        ResultSet rs=stmt.executeQuery(query);
        int i=0;
        while(rs.next()){
            roomNoList[i]=rs.getString("room_no");
            i++;
        }
        
        c.close();
        
        return roomNoList;
    }
    
    
    public boolean isTimeSlotPossible(String consultantId, String day, String startingTime, String endingTime, String roomNo) throws Exception{
        boolean isPossible=true;
        
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        String query="SELECT time_slot_id\n" +
                    "FROM time_slot \n" +
                    "WHERE (room_no="+roomNo+" AND day='"+day+"') AND ((starting_time<='"+startingTime+"' AND ending_time>='"+startingTime+"') OR (starting_time<='"+endingTime+"' AND ending_time>='"+endingTime+"'));";
        
        CommonDBOperations cdb=new CommonDBOperations();
        int count=cdb.countRecordsInTable(query);
        
        if(count!=0){
            isPossible=false;
        }
        
        c.close();
        
        return isPossible;
    }
    
    public void addNewTimeSlot(String consultantID, String day, String startingTime, String endlingTime, String maxPatients, String room_no) throws Exception{
        
        CommonDBOperations cdb=new CommonDBOperations();
        String query="SELECT * FROM time_slot ORDER BY time_slot_id;";
        String timeSlotID=cdb.getNextPrimaryKey("", query, "time_slot_id");
        int timeSlotIdInt=Integer.parseInt(timeSlotID);
        System.out.println(timeSlotIdInt);
        
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        String query1="INSERT INTO time_slot VALUES ("+timeSlotID+", '"+consultantID+"', '"+day+"', '"+startingTime+"', '"+endlingTime+"', 0, "+maxPatients+", "+room_no+");";
        
        stmt.executeUpdate(query1);
        
        c.close();
        
    }
}
