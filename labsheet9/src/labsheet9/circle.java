package labsheet9;
      //the public constants

public class circle {
	//the public constants
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "red";
	
      //the private 2 attributes
	private double radius;
	private String color;
	
	
	//Constructs  a circle with default radius and color
	//1st(default) Constructor
	circle(){
		this.radius = DEFAULT_RADIUS;
		this.color = DEFAULT_COLOR;
	}
	//Constructs  a circle with the given radius and default color
	//2nd Constructor
	circle(double radius){
		this.radius = radius;
		this.color = DEFAULT_COLOR;
	}
	//Constructs  a circle with the given radius and  color
	//3rd Constructor
	circle(double radius, String color){
		this.radius = radius;
		this.color=color;
	}
	//Returns the radius-the public getter for private attribute radius
	public double getRadius() {
		return this.radius;
	}
	//set the radius the public setter for private variable radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//get the color 
	public String getColor() {
		return this.color;
	}
	//set the color
	public void setColor(String color) {
		this.color = color;
	}
	//Return a  self-descriptive string for a circle
	public String toString() {
		return "Circle[radus = "+radius+", color = "+color+"]";
	}
	//return the area of this circle
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
		//return Math.PI * radius * radius;
	}
	 //return the circumference of this Circle
	public double getCircumference() {
		return 2.0 * Math.PI * radius;
	}
}
