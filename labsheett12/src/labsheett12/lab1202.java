package labsheett12;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class lab1202 {

	public static void main(String[] args)throws IOException {
		
		Scanner input = new Scanner(System.in);
        System.out.println("input email :  ");
        String Inputemail = input.next();
        Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
        while(readFile.hasNext()) {
        	
          String fname = readFile.next(); 
      	  String lname = readFile.next(); 
      	  String password = readFile.next(); 
      	  String  email = readFile.next(); 
        	
        	if(Inputemail.equalsIgnoreCase(email)) {
        		System.out.println("Your pass word is "+password);
        		break;
        	}
        	else {
        		System.out.println("The data not found");
        		break;
        	}
        	
        }
        readFile.close();
	}

}
