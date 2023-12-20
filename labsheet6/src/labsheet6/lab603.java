package labsheet6;
import java.util.*;
public class lab603 {
	static Scanner scan = new Scanner(System.in);
	static String fullname,firstname;
	
	public static void main(String[] args) {
		
	System.out.println("Please Enter your Name , Separated by a space : ");
	String fullName = scan.nextLine();
	String firstName = "";
	for(int a = 0; a < fullName.length(); a++) {
		if(fullName.charAt(a)==' ') {
			firstName = fullName.substring(0, a);
			break;
		}	
	}
		
    System.out.print(abbreviatName(fullName)+firstName);
	}
	
	public static String abbreviatName(String fullName) {
		String middleName = "";
		String LastName = "";
          int space =0;
		for(int a = 0; a < fullName.length(); a++) {
			if(fullName.charAt(a)==' ') {
				space++;
				if(space==1) {
					middleName = fullName.substring(a+1,a+2).toUpperCase()+".";
				}
				else if (space==2) {
					LastName = fullName.substring(a+1,a+2).toUpperCase()+".";
				}
				
			}	
			
		
	}
		return middleName+LastName;

	}
}
