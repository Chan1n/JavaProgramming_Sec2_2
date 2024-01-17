package labsheet9;
import java.util.*;
public class AuthorDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name, email;
		char gender;
		
		System.out.println("Input author name: ");
        name = scan.nextLine(); 	
		System.out.println("Input author email : ");
		email = scan.nextLine();
		System.out.println("Input author gender: ");
		gender = scan.next().charAt(0);
		
		Author author = new Author(name,email,gender);
		System.out.println();
		System.out.println(author);
	}

}
