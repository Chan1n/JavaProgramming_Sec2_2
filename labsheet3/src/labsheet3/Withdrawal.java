package labsheet3;
import javax.swing.*;

import java.text.DecimalFormat;
import java.util.Random;
public class Withdrawal {

	public static void main(String[] args) {
		//using class Random for random money 
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Random rdmoney = new Random();
		int balance = rdmoney.nextInt(9) * 100000;  
	    int withDraw = Integer.parseInt(JOptionPane.showInputDialog(null,"Your balance:" + frm.format(balance)+
			  "\nInput money to withdraw"));
	    
	    
	    
	    if(balance < withDraw) {
               JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than balance");	    	
	    }
	    else if (withDraw > 20000) {
	    	JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than 20,000");
	    }
	    else if (withDraw%100!=0)
	    {
	    	JOptionPane.showMessageDialog(null, "Error: Cannot withdraw 15 Baht.");
	    }
	    else {
	    	JOptionPane.showMessageDialog(null, "You withDraw "+ frm.format(withDraw) +"Baht."
	    +"\n1000 = " +(withDraw/1000+"\n500 = " +((withDraw%1000)/500))+"\n100 = "+((withDraw%500)/100));
	       
	    }
	    
	}

}
