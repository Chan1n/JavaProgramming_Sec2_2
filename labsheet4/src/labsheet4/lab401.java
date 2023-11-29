package labsheet4;
import java.util.*;
public class lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valueX,valueY;
		
		System.out.print("Input value x : ");
		valueX = scan.nextInt();
		
		while(true) {

			System.out.print("Input value y : ");
			valueY = scan.nextInt();
			if(valueX > valueY) {
				System.out.print("Input value y, again :" );
				valueY = scan.nextInt();
				break;
			}
			while(valueX<valueY)
			{
				valueX++;
				int totalvalue = valueX+valueY;
				System.out.println(valueX+" + "+valueY+ "=" +totalvalue );
			}
		  
			
		
		}
	}

}
