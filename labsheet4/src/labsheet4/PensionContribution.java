package labsheet4;
import java.text.DecimalFormat;
import java.util.*;
public class PensionContribution {

	public static void main(String[] args) {
		final int  SALARY_CEILING = 6000;
		final double EMPLOYYEE_RATE_55AND_BELOW = 0.2;
		final double EMPLOYYER_RATE_55AND_BELOW = 0.17;
		final double EMPLOYYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYYER_RATE_55_TO_60 = 0.13;
		final double EMPLOYYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYYEE_RATE_65 = 0.05;
		final double EMPLOYYER_RATE_65 = 0.075;
		double employeeontribution , employyerContribution , totalContribution;
		
		
		int salary,Age, contributableSalary;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the monthly" );
		salary = scan.nextInt();
		contributableSalary = Math.min(salary, SALARY_CEILING);
      	System.out.print("Enter the age:" );
	    Age = scan.nextInt();
	    
			
		if(Age<=55)
		{
			employeeontribution = contributableSalary*EMPLOYYEE_RATE_55AND_BELOW;
			employyerContribution = contributableSalary*EMPLOYYER_RATE_55AND_BELOW;
		}
		else if (Age>55 && Age <=60 )
		{
			employeeontribution = contributableSalary*EMPLOYYEE_RATE_55_TO_60;
			employyerContribution = contributableSalary*EMPLOYYER_RATE_55_TO_60;
		}
		else if (Age <60 && Age <=65)
		{
			employeeontribution = contributableSalary*EMPLOYYEE_RATE_60_TO_65;
			employyerContribution= contributableSalary*EMPLOYYER_RATE_60_TO_65;
		}
		else
		{
			employeeontribution = contributableSalary*EMPLOYYEE_RATE_65;
			employyerContribution= contributableSalary*EMPLOYYER_RATE_65;
		}
		System.out.printf("the employee's Contribution is: %.2f\n",employeeontribution);
				
		System.out.printf("the employer's Contribution is: %.2f\n",employyerContribution);
		totalContribution = employeeontribution+employyerContribution;
		System.out.printf("the total contribution is: %.2f\n",totalContribution);
		
		
		
	}
}
	

