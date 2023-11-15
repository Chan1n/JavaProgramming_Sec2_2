
public class Example1 {

	public static void main(String[] args) {
		String bookIsbn = "IB2-6325-85-4-1";
		String bookTitle = "Basic java Programming";
		int bookunit = 5;
		//float bookPrice = 225.75f;
		double bookPrice = 225.75;
		
		//display to console
		
		System.out.println("Book ISBN : "+bookIsbn);
		System.out.println("Book title : "+bookTitle);
		System.out.println("book Unit "+bookunit+ "Books.");
		System.out.println("book Price "+bookPrice+ "Baht.");
		System.out.println("------------------------------------------");
		
		//calculate totalprice and vat
		
		double totalPrice = bookunit * bookPrice;
		System.out.println("Total Price is "+totalPrice);
		double vat = totalPrice + (totalPrice * 7/100);
		System.out.println("Add VAT 7% is  "+vat);
		

	}

}
