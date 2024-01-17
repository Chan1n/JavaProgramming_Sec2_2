package labsheet9;
import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Book book = new Book();
		
		System.out.println("Input book title : ");
        book.setTitle(scan.nextLine()); 	
		System.out.println("Input book price : ");
		book.setPrice(scan.nextFloat());
		System.out.println("Input book year : ");
		book.setPublishyear(scan.nextInt());
		System.out.println();
		
		System.out.println(book.toString());
			 
		 
		
	}

}
