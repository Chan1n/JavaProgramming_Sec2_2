package labsheett12;
import java.util.*;
import java.io.*;

public class lab1201 {

	public static void main(String[] args) throws IOException{
		
          Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
          while(readFile.hasNext()) {
        	  String fname = readFile.next(); 
        	  String lname = readFile.next(); 
        	  readFile.next(); 
        	  String email = readFile.next(); 
        	  
        	  System.out.println(lname.substring(0,1)+"."+fname +""+"("+email+")");
        	  
        	    	  
          }
          readFile.close();
	}

}
