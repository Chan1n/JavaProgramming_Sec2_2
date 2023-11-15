import java.text.DecimalFormat;

import javax.swing.*; //1.import library for input data from dialog box
public class Example4 {

	public static void main(String[] args) {
		//2.Display and input data from dialog box
		DecimalFormat frm = new DecimalFormat("#,###.00");
		String productName = JOptionPane.showInputDialog("Input product name : ");
		
		//String strUnit = JOptionPane.showInputDialog("Input product unit");
		//convert string to int
		//int unitPrice = Integer.parseInt(strUnit);
		
		int unitPrice = Integer.parseInt(JOptionPane.showInputDialog("Input product unit"));
		
		float pricePerunit = Float.parseFloat(JOptionPane.showInputDialog("Input price per unit"));
		
		double totaPrice = unitPrice * pricePerunit;
		double vat = totaPrice +(totaPrice*7/100);
		
		//show message from dialog box
		JOptionPane.showMessageDialog(null, "Total price is "
				+frm.format(totaPrice)+ "Baht."
						+ "\nAdd vat 7% is "+ frm.format(vat) + "baht.");
		
		
		

	}

}
