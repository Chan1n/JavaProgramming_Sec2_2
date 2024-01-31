package labsheett11;

import java.time.Year;
import java.util.jar.Attributes.Name;

public class FictionBook implements Author,Book{
     private String author_name;
     private String email;
     private String title;
     private int publicYear;
     
      FictionBook(String title , int publicYear) {
    	 this.title = title;
    	 this.publicYear = publicYear;
     }
     
     public void setAuthorName(String Name) {
    	 this.author_name = Name;
     }
     public void setEmail(String email) {
    	 this.email = email;
     }
     public boolean checkFormatName() {
    	 String[] Name = this.author_name.split(" ");
    	 String firstName = Name[0];
    	 String LastName  = Name[0];
          if(firstName.length()> 0 && LastName.length() >0) {
        	  return true;
          }
          else {
        	  return false;
          }
     }
     
  
     public String getLastName() {
    	 String[] Name = this.author_name.split(" ");
    	 String LastName  = Name[1];
    	 return LastName.toUpperCase();
    	 
     }
    
     public String getFirstName() {
    	 String[] Name = this.author_name.split(" ");
    	 String firstName  = Name[1];
    	 return firstName.toUpperCase();
     }
     
     public boolean checkEmail() {
    	 if(this.email.endsWith("@hotmail.com")||email.endsWith("@windowslive.come")) {
    		 return true;
    	 }
    	 else {
    		 return false;
    	 }
    	 
    	 
     }
     public String getTitle() {
    	 return this.title;
     }
     public int totalPublicYear() {
    	 return Year.now().getValue()-publicYear;
     }
     public String toString() {
    	 return "["+this.title+"]write by ["+this.author_name+"]["+this.getFirstName()+"]("+this.email+")published for ["+this.totalPublicYear()+"+year";
     }

}
