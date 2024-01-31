package labsheett11;
import javax.swing.*;
public class RectangleDemo1 {

	public static void main(String[] args) {
		// input width length color from dialog box
		double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input width: "));
		
		double LengthInput = Double.parseDouble(JOptionPane.showInputDialog("Input Length: "));
		
		String colorInput = JOptionPane.showInputDialog("Input color:");
		//send all data to constructor from Rectangle class
		Rectangle obj1 = new Rectangle(widthInput , LengthInput , colorInput);
       
		JOptionPane.showMessageDialog(null, obj1.toString()+
				"\nArea of Rectangle is "+obj1.getArea()); 
		
		//using interface Class
		
	}

}
