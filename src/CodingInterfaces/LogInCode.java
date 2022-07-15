// Code related to operations used in LogIn Interface

package CodingInterfaces;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


// Accepts entered Staff-ID and Password as parameters
// And checks whether both of them are valid and matching by checking records in staff table 
// and consultant table according to the prefix of the entered Staff-ID
// If valid returns (valid, staff_type, forename, surname, ID)
// If invalid returns (invalid, null, null, null, null)
// Note - Only Consultants, Receptionisits and Managers among the staff members can login to the system 
// although there are other types of staff details stored in the database
public class LogInCode {
    public String[] handleLogin(String staff_ID, String password) throws Exception{
        String[] status={"invalid", null, null, null, null};
        
        if(staff_ID.equals("") || password.equals("")){
            staff_ID="STF0";
            password="no_pass";
        }
        
        String prefix=(""+staff_ID.charAt(0)+staff_ID.charAt(1)+staff_ID.charAt(2));
        
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        String query1="SELECT staff_id, forename, surname, staff_type, password FROM staff ORDER BY staff_id ASC;";
        String query2="SELECT consultant_id, forename, surname, password FROM consultant ORDER BY consultant_id ASC;";
        
        if(prefix.equalsIgnoreCase("STF") || prefix.equalsIgnoreCase("CON")){
            if(prefix.equalsIgnoreCase("STF")){
                ResultSet rs1=stmt.executeQuery(query1);
                
                while(rs1.next()){
                    if(staff_ID.equalsIgnoreCase(rs1.getString("staff_id")) && password.equals(rs1.getString("password"))){
                        if((rs1.getString("staff_type")).equals("Receptionist")){
                            status[0]="valid";
                            status[1]="Receptionist";
                            status[2]=rs1.getString("forename");
                            status[3]=rs1.getString("surname");
                            status[4]=rs1.getString("staff_id");
                            
                            break;
                        }else if((rs1.getString("staff_type")).equals("Manager")){
                            status[0]="valid";
                            status[1]="Manager";
                            status[2]=rs1.getString("forename");
                            status[3]=rs1.getString("surname");
                            status[4]=rs1.getString("staff_id");
                            
                            break;
                        }
                    }  
                }
            }else if(prefix.equalsIgnoreCase("CON")){
                ResultSet rs2=stmt.executeQuery(query2);
                
                while(rs2.next()){
                    if(staff_ID.equalsIgnoreCase(rs2.getString("consultant_id")) && password.equals(rs2.getString("password"))){
                        status[0]="valid";
                        status[1]="Consultant";
                        status[2]=rs2.getString("forename");
                        status[3]=rs2.getString("surname");
                        status[4]=rs2.getString("consultant_id");
                        
                        break;
                    }  
                }
            }
        }
        
        c.close();
        return status;
    }
}



        
        
