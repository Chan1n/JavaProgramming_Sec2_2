package labsheett13;
import java.io.*;
import java.util.*;
public class AddProduct {

	public static void main(String[] args)throws IOException {
		
		
		PrintWriter writeFile = new PrintWriter(new File("d://txtFile//product.txt"));
		// create object for input data from keyboard(console)
        Scanner scan = new Scanner(System.in);
        //Display and input data from keyboard
        System.out.print("input product id : ");
        String productID= scan.next();
        System.out.print("input product name : ");
        String productName= scan.next();
        System.out.print("input product unit : ");
        int productUnit = scan.nextInt();
        System.out.print("input product Price : ");
        float productPrice = scan.nextFloat();
        //save data to file
        writeFile.println(productID+","+productName+","+productUnit+","+productPrice);
        System.out.println("Save file already...");
        writeFile.close();
        
	}

}
