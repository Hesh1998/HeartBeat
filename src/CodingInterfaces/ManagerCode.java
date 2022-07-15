package CodingInterfaces;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class ManagerCode {
    public int[] handleDashboard() throws Exception{
        String query1="SELECT * FROM consultant ORDER BY consultant_id ASC;";
        String query2="SELECT * FROM staff WHERE staff_type='Manager' ORDER BY staff_id ASC;";
        String query3="SELECT * FROM staff WHERE staff_type='Nurse' ORDER BY staff_id ASC;";
        String query4="SELECT * FROM staff WHERE staff_type='Pharmacist' ORDER BY staff_id ASC;";
        String query5="SELECT * FROM staff WHERE staff_type='Receptionist' ORDER BY staff_id ASC;";
        String query6="SELECT * FROM staff WHERE staff_type='Supporting Staff' ORDER BY staff_id ASC;";
        
        int count[]=new int[6];
        CommonDBOperations commonObj=new CommonDBOperations();
        count[0]=commonObj.countRecordsInTable(query1);
        count[1]=commonObj.countRecordsInTable(query2);
        count[2]=commonObj.countRecordsInTable(query3);
        count[3]=commonObj.countRecordsInTable(query4);
        count[4]=commonObj.countRecordsInTable(query5);
        count[5]=commonObj.countRecordsInTable(query6);
        
        return count;
    }
    
    public String[][] returnConsultantDetails() throws Exception{
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        String query="SELECT * FROM consultant ORDER BY consultant_id ASC;";
        
        
        CommonDBOperations cdb=new CommonDBOperations();
        int count=cdb.countRecordsInTable(query);
        String table[][]=new String[count][3];
        
        ResultSet rs=stmt.executeQuery(query);
        int i=0;
        while(rs.next()){
            table[i][0]=rs.getString("consultant_id");
            table[i][1]="Dr. "+rs.getString("forename")+" "+rs.getString("surname");
            table[i][2]=rs.getString("speciality");
           
            i++;
        }
        
        c.close();
        
        return table;
    }
    
    
    public String[][] returnStaffDetails() throws Exception{
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        String query="SELECT * FROM staff ORDER BY staff_id ASC;";
        
        
        CommonDBOperations cdb=new CommonDBOperations();
        int count=cdb.countRecordsInTable(query);
        String table[][]=new String[count][3];
        
        ResultSet rs=stmt.executeQuery(query);
        int i=0;
        while(rs.next()){
            table[i][0]=rs.getString("staff_id");
            table[i][1]=rs.getString("forename")+" "+rs.getString("surname");
            table[i][2]=rs.getString("staff_type");
           
            i++;
        }
        
        c.close();
        
        return table;
    }
}
