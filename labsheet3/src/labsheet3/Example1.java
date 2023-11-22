package labsheet3;

import javax.swing.*;

public class Example1 {

	public static void main(String[] args) {
		final int BUFFET =299;
		//input and convert data from dialog box
		int numberofCustomber = Integer.parseInt(JOptionPane.showInputDialog("How many customber per bill"));
		
	    double priceAfterdiscount , totalPrice =0;
	    //calculate total price of buffet
	    totalPrice = BUFFET * numberofCustomber;
	    //using showMessage dialog box for display totalPrice
	 //   JOptionPane.showMessageDialog(null, "Amount to be paid is "+ totalPrice +" Baht.");
	    //using confirm dialog box
	    int memberCard;
	   do {
	    	memberCard = JOptionPane.showConfirmDialog(null, "Toal price is "+totalPrice+"Baht."
	    		    +"\nDo you have a member card");
	    }while(memberCard==JOptionPane.CANCEL_OPTION);
	    
	    if(memberCard==JOptionPane.YES_OPTION)
	    {
	    	priceAfterdiscount = totalPrice * 90/100 ;//discount 10%
	    	JOptionPane.showMessageDialog(null, "Amount to be paid is "+ priceAfterdiscount +" Baht.");
	    	
	    }//end of if
	    
	    else if(memberCard==JOptionPane.NO_OPTION)
	    {
	    	JOptionPane.showMessageDialog(null, "Amount to be paid is "+ totalPrice +" Baht.");
	    }//end of else
	    
	    
	    
	    	
	   
	    	
	    

	}

}
