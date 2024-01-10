package labsheet8;

import java.util.Scanner;

public class testPiggyBank {
    static PiggyBank pb = new PiggyBank();
    static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		/*pb.setPiggyBank(500);
		System.out.println("Money total : "+ pb.getTotal());
		pb.addTwo(34);
		System.out.println("Add 2  money : "+34);
		System.out.println("Money total : "+ 13);
		pb.addTen(13);
		System.out.println("Add 10  money : "+13);
		System.out.println("Money total : " +pb.getTotal());
		pb.addFive(100);*/
		inputCoin();
	}
     public static void inputCoin() {
    	 System.out.println("money tota; : "+pb.getTotal());
    	 System.out.println("Please define size of PiggyBank : ");
    	 int sizeofPiggyBank = scan.nextInt();
    	 pb.setPiggyBank(sizeofPiggyBank);
    	 System.out.println("Money total : "+pb.getPiggyBank());
    	 MainMenu();
     }
     
     public static void MainMenu() {
    	 while (true) {
    		 System.out.print("===================");
    		 System.out.println("Menu of PiggyBank");
    		 System.out.println("====================");
    		 System.out.println("[1] one baht.");
    		 System.out.println("[2] two baht.");
    		 System.out.println("[3] five baht.");
    		 System.out.println("[4] ten baht.");
    		 System.out.println("[5] Exit.");
    		 System.out.println("Please Select Menu[1-5] :  ");
    		 int Select = scan.nextInt();
    		 
    		
    		 
    		 if(Select == 1) {
    			 System.out.println("Insert 1 Baht Money :  ");	
 			     int a = scan.nextInt();
 			     pb.addOne(scan.nextInt());
 			     System.out.print("Money total : "+pb.getTotal());
    		 }
    		 else if (Select == 2){
    			 System.out.println("Insert 2 Baht Money :  ");	
    			 pb.addOne(scan.nextInt());
    			 System.out.print("Money total : "+pb.getTotal());
    		 }
    		 else if (Select == 3) {
    			 System.out.println("Insert 5 Baht Money :  ");	
    			 pb.addOne(scan.nextInt());
    			 System.out.print("Money total : "+pb.getTotal());
    		 }
    		 else if (Select ==4) {
    			 System.out.println("Insert 10 Baht Money :  ");	
    			 pb.addOne(scan.nextInt());
    			 System.out.print("Money total : "+pb.getTotal());
    		 }
    		 else if (Select ==5) {
    			 System.out.println("Bye Bye");
    			 break;
    		 }
			
    	 }
     }
}
