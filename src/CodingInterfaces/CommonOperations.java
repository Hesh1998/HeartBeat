// codes related to commonly used operations in the database

package CodingInterfaces;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;

public class CommonOperations {
    // bubble sort method used to sort an int array of any length
    public void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
    
    // Converts date format stored in the database to date format in jDateChooser
    public String convertDateToJDateChooser(String date){
        String convertedDate=null;
        
        String dateTemp[]=date.split("-");
        
        String year=null, month=null, day=null;
        
        switch(dateTemp[1]){
            case "01" : month="Jan"; break;
            case "02" : month="Feb"; break;
            case "03" : month="Mar"; break;
            case "04" : month="Apr"; break;
            case "05" : month="May"; break;
            case "06" : month="Jun"; break;
            case "07" : month="Jul"; break;
            case "08" : month="Aug"; break;
            case "09" : month="Sep"; break;
            case "10" : month="Oct"; break;
            case "11" : month="Nov"; break;
            case "12" : month="Dec"; break;
        }
        
        day=dateTemp[2];
        if(day.charAt(0)=='0'){
            day=day.replaceFirst("0", "");
        }
        
        year=dateTemp[0];
        
        convertedDate=month+" "+day+", "+year;

        return convertedDate;
    }
    
    
    // Converts date format of JDateChooser to date format in database
    public String convertDateToDatabase(String dateOfBirth){
        String splitted[]=dateOfBirth.split(" ");
        String year=splitted[5];
        String month=null;
        String day=splitted[2];
        
        switch(splitted[1]){
            case "Jan" : month="01"; break;
            case "Feb" : month="02"; break;
            case "Mar" : month="03"; break;
            case "Apr" : month="04"; break;
            case "May" : month="05"; break;
            case "Jun" : month="06"; break;
            case "Jul" : month="07"; break;
            case "Aug" : month="08"; break;
            case "Sep" : month="09"; break;
            case "Oct" : month="10"; break;
            case "Nov" : month="11"; break;
            case "Dec" : month="12"; break;
        }
        
        dateOfBirth=null;
        dateOfBirth=(year+"-"+month+"-"+day);
        
        return dateOfBirth;
    }
    
    
    public String getDate(String date, String day1, String day2) throws Exception{
        int difference=0;
        
        String days[]={"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
 
        if(!day1.equalsIgnoreCase(day2)){
            int i=0;
            for(; i<7; i++){
                if(days[i].equalsIgnoreCase(day1)){
                    break;
                }
            }
            
            for(int j=i+1; j<i+7; j++){
                difference++;
                if(days[j].equalsIgnoreCase(day2)){
                    break;
                }
            }
            
            SimpleDateFormat sdf=new SimpleDateFormat("E, MMM dd yyyy");
            Calendar c=Calendar.getInstance();
            c.setTime(sdf.parse(date));
            c.add(Calendar.DATE, difference);
            date=sdf.format(c.getTime());
        }
      
        return date;
    }
    
    
    public String convertInterfaceDateToDatabase(String date){
        String dateComponents[]=date.split(" ");
        String year=dateComponents[3], month=null, day=dateComponents[2];
        
        switch(dateComponents[1]){
            case "Jan" : month="01"; break;
            case "Feb" : month="02"; break;
            case "Mar" : month="03"; break;
            case "Apr" : month="04"; break;
            case "May" : month="05"; break;
            case "Jun" : month="06"; break;
            case "Jul" : month="07"; break;
            case "Aug" : month="08"; break;
            case "Sep" : month="09"; break;
            case "Oct" : month="10"; break;
            case "Nov" : month="11"; break;
            case "Dec" : month="12"; break;
        }
        
        date=null;
        date=year+"-"+month+"-"+day;
        return date;
    }
    
    
    public int getAgeFromDOB(String dob){
        LocalDate today = LocalDate.now();                       
        LocalDate birthday = LocalDate.parse(dob);

        Period p = Period.between(birthday, today);
        
        return p.getYears();
    }
}



