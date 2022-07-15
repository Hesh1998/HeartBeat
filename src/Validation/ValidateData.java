// codes related to all data validations in the program

package Validation;


import CodingInterfaces.DBConnectivity;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


// class which contains all the validations
public class ValidateData {
    
    // validates the NIC number (both Old type and New type)
    // returns true if NIC number is valid
    // returns false if NIC number is invalid
    public boolean isValidNIC(String numNIC){
        boolean isNICValid=true;
        if(numNIC.length()==10 || numNIC.length()==12){
            if(numNIC.length()==10){ // Old NIC number
                if(numNIC.charAt(9)=='V' || numNIC.charAt(9)=='v'){
                    for(int i=0; i<9; i++){
                        if(!(Character.isDigit(numNIC.charAt(i)))){
                            isNICValid=false;
                        }
                    }
                }else{
                    isNICValid=false;
                }
            }else if(numNIC.length()==12){
                for(int i=0; i<12; i++){
                    if(!(Character.isDigit(numNIC.charAt(i)))){
                        isNICValid=false;
                    }
                }
            }else{
                isNICValid=false;
            }
        }else{
            isNICValid=false;
        }
        
        return isNICValid;
    }
    
    
    // validates the entered phone number (Mobile and LAN) for 10 digits
    // if valid returns true
    // if invalid returns false
    public boolean isValidPhoneNum(String phoneNum){
        boolean isPhoneNumValid=true;
        
        if(phoneNum.length()==10){
            for(int i=0; i<10; i++){
                if(!(Character.isDigit(phoneNum.charAt(i)))){
                    isPhoneNumValid=false;
                }
            }
        }else{
            isPhoneNumValid=false;
        }
        
        return isPhoneNumValid;
    }
    
    
    // validates the format of the entered email address
    // if valid returns true
    // if invalid returns false
    public boolean isValidEmail(String email){
        String emailRegex="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPattern=Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
        Matcher emailMatcher=emailPattern.matcher(email);
        
        return emailMatcher.find();
    }
    
    
    // validates Positive Integers
    // if valid returns true
    // if invalid returns false
    public boolean isValidPositiveInteger(String numPositiveInt){
        boolean isPositiveIntegerValid=true;
        int num=0;
        
        try{
            num=Integer.parseInt(numPositiveInt);
            
            if(num<=0){
                isPositiveIntegerValid=false;
            }
        }catch(Exception e){
            isPositiveIntegerValid=false;
        }
        
        return isPositiveIntegerValid;
    }
    
    
    // validates Positive Floating point literals
    // if valid returns true
    // if invalid returns false
    public boolean isValidPositiveFloatingPoint(String numPositiveFloatingPoint){
        boolean isPositiveFloatingPointValid=true;
        double num=0.0;
        
        try{
            num=Double.parseDouble(numPositiveFloatingPoint);
            
            if(num<=0.0){
                isPositiveFloatingPointValid=false;
            }
        }catch(Exception e){
            isPositiveFloatingPointValid=false;
        }
        
        return isPositiveFloatingPointValid;
    }
    
    
    // validates price(payment)
    // if valid returns true
    // if invalid returns false
    public boolean isValidPrice(String numPrice){
        boolean isPriceValid=true;
        double num=0.0;
        
        try{
            num=Double.parseDouble(numPrice);
            
            if(num<=0.0){
                isPriceValid=false;
            }
            
            String newPrice=Double.toString(num);
            int length=newPrice.length();
            
            if(!(newPrice.charAt(length-3)=='.')){
                isPriceValid=false;
            }
        }catch(Exception e){
            isPriceValid=false;
        }
        
        return isPriceValid;
    }
    
    
    // validates forename and surname
    // if valid returns true
    // if invalid returns false
    public boolean isValidForenameOrSurname(String forenameOrsurname){
        return forenameOrsurname.matches( "[A-Z][a-z]*" );
    }
    
    
    // validates the length of string entered as input for a text field
    // used to prevent possible SQL errors in case the input given exceeds the length given for that attribute in the database
    public boolean isValidLength(String data, int length){
        boolean isLengthValid=true;
        
        if(data.length()>length){
            isLengthValid=false;
        }
        
        return isLengthValid;
    }
    
    
    // validates passed patientCode as an argument by searching in patient table in database
    // if valid returns {valid, patient_code}
    // if invalid returns {invalid, null}
    public String[] isValidPatientCode(String patientCode) throws Exception{
        String isPatientCodeValid[]={"invalid", null};
        String newPatientCode=null;
        
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        String query="SELECT patient_code FROM patient;";
        ResultSet rs=stmt.executeQuery(query);
        
        if(patientCode.equals("")){
            patientCode="No";
        }
        
        if(patientCode.charAt(0)=='P' || patientCode.charAt(0)=='p'){
            String prefix=Character.toString(patientCode.charAt(0));
            newPatientCode=null;
            newPatientCode=patientCode.replaceFirst(prefix, "");
            if(isValidPositiveInteger(newPatientCode)){
                newPatientCode="P"+newPatientCode;
                while(rs.next()){
                    if(newPatientCode.equals(rs.getString("patient_code"))){
                        isPatientCodeValid[0]="valid";
                        isPatientCodeValid[1]=rs.getString("patient_code");
                    }
                }
            }
        }
        
        c.close();
        
        return isPatientCodeValid;
    }
    
    
    // validates passed Consultant ID as an argument by searching in consultant table in database
    // if valid returns {valid, consultant_id}
    // if invalid returns {invalid, null}
    public String[] isValidConsultantID(String consultantID) throws Exception{
        String isConsultantIDValid[]={"invalid", null};
        String newConsultantID=null;
        
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        String query="SELECT consultant_id FROM consultant;";
        ResultSet rs=stmt.executeQuery(query);
        
        if(consultantID.equals("")){
            consultantID="No";
        }
        
        if((consultantID.charAt(0)=='C' && consultantID.charAt(1)=='O' && consultantID.charAt(2)=='N') || consultantID.charAt(0)=='c' && consultantID.charAt(1)=='o' && consultantID.charAt(2)=='n'){
            String prefix=Character.toString(consultantID.charAt(0))+Character.toString(consultantID.charAt(1))+Character.toString(consultantID.charAt(2));
            newConsultantID=null;
            newConsultantID=consultantID.replaceFirst(prefix, "");
            if(isValidPositiveInteger(newConsultantID)){
                newConsultantID="CON"+newConsultantID;
                while(rs.next()){
                    if(newConsultantID.equals(rs.getString("consultant_id"))){
                        isConsultantIDValid[0]="valid";
                        isConsultantIDValid[1]=rs.getString("consultant_id");
                    }
                }
            }
        }
        
        c.close();
        
        return isConsultantIDValid;
    }
    

    public boolean isValidAppointmentNo(String appointmentNo, String consultantID) throws Exception{
        boolean isAppointmentNoValid=false;
        
        DBConnectivity db=new DBConnectivity();
        Connection c=db.getDBConnection();
        Statement stmt=c.createStatement();
        String query="SELECT appointment_no\n" +
                        "FROM appointment\n" +
                        "WHERE time_slot_id IN (SELECT time_slot_id FROM time_slot WHERE consultant_id='"+consultantID+"');";
        ResultSet rs=stmt.executeQuery(query);
        
        if(appointmentNo.equals("")){
            appointmentNo="0";
        }
        
        
        if(isValidPositiveInteger(appointmentNo)){
            while(rs.next()){
                if(appointmentNo.equals(rs.getString("appointment_no"))){
                    isAppointmentNoValid=true;
                }
            }
        }
        
        
        c.close();
        
        return isAppointmentNoValid;
    }
}


