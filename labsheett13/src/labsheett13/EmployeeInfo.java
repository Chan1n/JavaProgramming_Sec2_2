package labsheett13;
import java.io.*;
import java.util.*;
public class EmployeeInfo {

	public static void main(String[] args)throws IOException {
		 // create object for input data from keyboard(console)
	     Scanner scan = new Scanner(System.in);
         String choice,department;
         System.out.print("Insert or Read data?: ");
         choice = scan.next().toLowerCase();
         
         while(!(choice.equals("insert")) && !(choice.equals("read"))) {
        	  System.out.println("Pleas type Insert or Read data,again: ");
              choice = scan.next().toLowerCase();          
         }
         //create object : call all method in class SaveandOpen
         SaveandOpen obj = new SaveandOpen();
         if(choice.equals("insert")) {
        	 obj.insert();
         }else if(choice.equals("read")) {
        	 System.out.print("\nEnter dept : ");
        	 department = scan.next();
        	 obj.setDept(department);//sent department to setDet() method from class Employee
        	 obj.read(); // call read method form class SaveandOpen
        	 
        	 
         }
         
	}

}
