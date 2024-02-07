package labsheett12;
import java.io.*;
import java.util.*;
import java.util.Scanner.*;

public class lab1204 {

	public static void main(String[] args)throws IOException {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter rating of book : ");
        float rating = input.nextFloat();
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		 String tmp ="";
	        int countBook = 0, i = 1;
	        while ((tmp = readFile.readLine())!= null)  {
	        	String[] data = tmp.split("\t");
	        	System.out.println(i+"."+data[0]+"("+data[1]+"), Rating"+data[2]
	        		+"publish on "+data[5]);
	        	countBook++;
	        	i++;
	}
	        System.out.println("=========================================");
	        System.out.println("total number of book : "+ countBook);
}
}