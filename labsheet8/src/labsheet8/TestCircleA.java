package labsheet8;

public class TestCircleA {

	public static void main(String[] args) {
		CircleA c1 = new CircleA();
		CircleA c2 = new CircleA();
		CircleA c3 = new CircleA();
		
		c1.setRadius(2.0);
		c1.setcolor("blue");
		
		System.out.print("Circle of object c1 area is"+c1.getArea());
		System.out.println(",and color is "+c1.getColor());
		System.out.println();
		
		c2.setRadius(2.0);
		c2.setcolor("red");
		
		System.out.print("Circle of object c2 area is"+c2.getArea());
		System.out.println(",and color is "+c2.getColor());
		System.out.println();
		
		c3.setRadius(1.0);
		c3.setcolor("red");
		
		System.out.print("Circle of object c3 area is"+c3.getArea());
		System.out.println(",and color is "+c3.getColor());
	}

}
