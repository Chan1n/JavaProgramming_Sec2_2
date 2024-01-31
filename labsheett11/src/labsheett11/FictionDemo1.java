package labsheett11;
import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("title : ");
		String title = scan.nextLine();
		
		System.out.println("year : ");
		int year = scan.nextInt();
		
		FictionBook book = new FictionBook(title,year);
		scan.nextLine();
		System.out.println("name : ");
		String name = scan.next();
		
		System.out.println("email :");
		String email = scan.next();
		
		book.setAuthorName(name);
		book.setEmail(email);
		
		
		while(!book.checkFormatName()) {
			System.out.print("Input again");
			name = scan.next();
			book.setAuthorName(name);
		}
		while(!book.checkEmail()) {
			System.out.print("Input again");
			email = scan.next();
			book.setEmail(email);
		}
		
		System.out.print(book.toString());
		
		

	}

}
