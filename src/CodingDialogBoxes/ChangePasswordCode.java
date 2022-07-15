// code related to operations used in ChangePassword dialog box
// Code related to changing an exisiting password (Staff member password or Consultant password)

package CodingDialogBoxes;

import CodingInterfaces.DBConnectivity;
import java.sql.Connection;
import java.sql.Statement;
import java.util.regex.*; 

public class ChangePasswordCode {
    // Checks whether the newly given password satisfies the following conditions
    // 1) Contain at least 8 characters and at most 20 characters
    // 2) Contain at least one digit
    // 3) Contain at least one upper case alphabet
    // 4) Contain at least one lower case alphabet
    // 5) Contain at least one special character which includes !@#$%&*()-+=^
    // 6) Doesn’t contain any white space
    // If atleast one of these situatuions are violated method returns false
    // And if only all conditions are satisfied the method returns true
    public boolean isNewPasswordValid(String newPassword){
        String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex); 
        
        if (newPassword.equals("")) { 
            return false; 
        }
        
        Matcher m = p.matcher(newPassword); 
        
        return m.matches(); 
    }
    
    
    // checks whether the new password and new password confimation are exactly matching
    // if matching returns true otherwise returns false
    public boolean confirmNewPasswrod(String newPassword, String newConfirmPassword){
        boolean passwordMatches=true;
        if(!newPassword.equals(newConfirmPassword)){
            passwordMatches=false;
        }
        
        return passwordMatches;
    }
    
    
    // Updates the current password of user with the newly given password
    public void changePassword(String staffID, String newPassword) throws Exception{
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        
        String query=null;
        
        if(staffID.charAt(0)=='S' && staffID.charAt(1)=='T' && staffID.charAt(2)=='F'){
            query="UPDATE staff SET `password` = '"+newPassword+"' WHERE staff_id='"+staffID+"';";
        }else if(staffID.charAt(0)=='C' && staffID.charAt(1)=='O' && staffID.charAt(2)=='N'){
            query="UPDATE consultant SET `password`='"+newPassword+"' WHERE consultant_id='"+staffID+"';";
        }
        
        stmt.executeUpdate(query);
        c.close();
    }
}
