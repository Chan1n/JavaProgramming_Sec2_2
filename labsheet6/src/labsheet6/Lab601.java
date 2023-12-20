package labsheet6;
import javax.swing.*;
public class Lab601 {

	public static void main(String[] args) {
		inputEmail();
	}
	public static void inputEmail() {
		String inputEmail = JOptionPane.showInputDialog("Input your email : ").toLowerCase(); 
		
		
        boolean chkEmail = checkEmail(inputEmail);      
        displayEmail(chkEmail,inputEmail);
        
	}
	
	public static boolean checkEmail(String Email){
		
		if(Email.endsWith("hotmail.com")|| Email.endsWith("gmail.com")) {
  			  return true;
		}
		else return false;
	}
     public static void displayEmail(boolean chEmail,String inEmail) {
    	 if(chEmail==true) {
         	JOptionPane.showMessageDialog(null,"Your e-mail is"+inEmail);
         }
         else {
         	JOptionPane.showMessageDialog(null,"Your e-mail is not hotmail or email");
         }
     }
			
		
		
	}
	


