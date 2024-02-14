package labsheett13;

import java.io.*;
import java.util.*;

public class senttentText {

	public static void main(String[] args)throws IOException {
	     // create object for write to file using PrintStrem class
		PrintStream writeFile = new PrintStream(new File("d://txtFile//sentence.txt"));
		 // create object for input data from keyboard(console)
         Scanner scan = new Scanner(System.in);
         int i =1;
         while(true) {
        	 System.out.print("sentence: ");
        	 String word = scan.next().toUpperCase();
        	 
            if(word.equalsIgnoreCase("stop")) {
            	break;
            }
            //save data to file
            writeFile.println(i+":"+word);
            i++;
         }
         System.out.println("File is save!!");
         
         writeFile.close();
         
	}

}
