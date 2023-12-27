package labsheet7;
import java.util.*;
public class lab702 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] score =new double [5];
		for(int i = 0; i<score.length;i++) {
			System.out.print("Input number "+(i+1)+": ");
			score[i] = scan.nextDouble();
		}
		double totalScore =0;
		for(double scores : score) {
			totalScore += scores;
			}
		double Average = totalScore/score.length;
		System.out.print("Average of "+score.length+" student is "+Average);
		
		for(int i =0; i<score.length;i++) {
			if (score[i] > Average)
        	{
        		System.out.println("> Student "+(i+1)+ " ("+score[i]+")");
        		
        		
        	}
		}
		
	}
	}
	
