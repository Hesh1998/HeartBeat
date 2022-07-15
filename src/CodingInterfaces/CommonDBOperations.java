// coding related to commonly used database operations in the program

package CodingInterfaces;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class CommonDBOperations {
    // accepts a query as the parameter
    // and returns the number of records in the resultant relation
    public int countRecordsInTable(String query) throws Exception{
        int count=0;
        
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();   
            
        ResultSet rs=stmt.executeQuery(query);
        
        while(rs.next()){
            count++;
        }
        
        c.close();
        
        return count;
    }
    
    
    // method which auto generates the primary key value of the new record of any given table
    // Acceps prefix of primary key, query to get count of records in the table and attribute name of the primary key field in table
    // When deciding the suitable primary key value for the new record gaps between already available primary key values are considered
    // and first tries to fill such a gap
    // and if only not possible the record is given the incremented value of the primay key value of last record
    public String getNextPrimaryKey(String prefix, String query, String attributeName) throws Exception{
        String primaryKey=null;
        String newPrimaryKey=null;
        
        CommonDBOperations obj=new CommonDBOperations();
        int count=obj.countRecordsInTable(query);
        int codesInt[]=new int[count];
        
        
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();   

        ResultSet rs=stmt.executeQuery(query);

        int i=0;
        while(rs.next()){
            primaryKey=rs.getString(attributeName);

            if(!(prefix.equals(""))){
                primaryKey=primaryKey.replaceFirst(prefix, "");
            }

            codesInt[i]=Integer.parseInt(primaryKey);
            i++;
        }

        CommonOperations cO=new CommonOperations();
        cO.bubbleSort(codesInt);

        for(int j=0; j<count; j++){
            if((j+1)!=codesInt[j]){
                newPrimaryKey=(prefix+Integer.toString(j+1));
                break;
            }   
        }

        if(newPrimaryKey==null ){
            newPrimaryKey=(prefix+Integer.toString(count+1));
        }

        c.close();   
        
        
        
        return newPrimaryKey;
    }
}
