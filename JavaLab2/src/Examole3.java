import java.util.*; //1.import library for input data from keyboard(Console)
public class Examole3 {

	public static void main(String[] args) {
		//2. define object for Scanner class
		Scanner console = new Scanner(System.in);
		//3. display text and input data
		System.out.print("input product name : ");
		String productName = console.nextLine();
		System.out.println("Input product unit : ");
		int productUnit = console.nextInt();
		System.out.println("Input price per unit : ");
		float pricePerUnit = console.nextFloat();
		
		System.out.println(); //เว้น 1 บรรทัด
		
		double totalPrice = productUnit*pricePerUnit;
		System.out.println("total price is "+totalPrice+"Baht.");
		double vat = totalPrice + (totalPrice*7/100);
		System.out.println("Add vat 7% is "+vat+"Baht.");

	}

}
