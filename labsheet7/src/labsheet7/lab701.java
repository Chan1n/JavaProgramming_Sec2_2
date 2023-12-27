package labsheet7;
import java.util.*;
public class lab701 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] number =new int [7];
		for(int i = 0; i<number.length;i++) {
			System.out.print("Input number "+(i+1)+": ");
			number[i] = scan.nextInt();
		}
		
		int oddNum =0;
        for(int numbers : number) {
        	if (numbers %2 != 0)
        	{
        		oddNum++;
        	}    	
        }
        
        System.out.println("there are "+oddNum+"of odd number.");
        System.out.print("List of ood number : ");
        for(int numbers : number) {
        	if (numbers %2 != 0)
        	{
        		System.out.print(" "+numbers);
        		
        	}
        	
        	
        	
        }
       
      
	}

}
