package labsheet9;

public abstract class testDateClass {

	public static void main(String[] args) {
		// test Constructor and toString()
		DateClass d1 = new DateClass(2023,2,8);
		System.out.println(d1);
		
		//test Setter and Getter
		d1.setYear(2024);
		d1.setMonth(12);
		d1.setDay(21);
		System.out.println(d1);
		System.out.println("Year is: "+d1.getYear());
		System.out.println("Month is: "+d1.getMonth());
		System.out.println("Day is: "+d1.getDay());
		
		//test setDate()
		d1.setDate(2024 , 1, 2);
		System.out.println("the date of object d1: "+d1);

	}

}
