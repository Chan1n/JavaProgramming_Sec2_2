package labsheet4;
import java.text.DecimalFormat;
import java.util.*;
public class SAlespersonSalary {

	public static void main(String[] args) {
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1;
		int sales;
		double salary;
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		while(true)
		{
			System.out.print("Entr sales in dollars (or -1 to end ): ");
			sales = scan.nextInt();
			if(sales == SENTINEL)
			{
				System.out.print("Bye");
				break;
			}
			
			salary = 1000 + (sales*COMMISSION_RATE);
			System.out.println("Salary is : "+frm.format(salary));
		}
		
	}

}
