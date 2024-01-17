package labsheet9;

public class TestCircle {
	
	public static void main(String[] args) {
      // test all constructors and toString()
		
	circle c1 = new circle(1.1,"blue");//call 3nd constructor
	System.out.println(c1);//call toString() method c.1tostring
	System.out.println();
	
	circle c2 = new circle(2.2);
	System.out.println(c2);
	
	circle c3 = new circle();//1st (default constructor)
	System.out.println(c3);
	System.out.println();
	//test Setters and Getters
	c1.setRadius(3.3);
	c1.setColor("green");
	System.out.println(c1);
	System.out.println("the radius of c1 is : "+c1.getRadius());
	System.out.println("the color of c1 is :"+c1.getColor());
	
	//test get area and getCircumference
	System.out.printf("the area is : %.2f%n",c1.getArea());
	System.out.printf("the circumference is : %.3f", c1.getCircumference());
	
	}
}
