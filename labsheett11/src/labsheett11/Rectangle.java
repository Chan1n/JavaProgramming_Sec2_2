package labsheett11;

public class Rectangle extends Shape {
     private double width;
     private double Length;
     
     Rectangle(double width, double Length ,String color){
    	 super(color); // call attribute color from constructor method in class shape
    	 this.width = width;
    	 this.Length = Length;
     }
     public double getWidth() {
    	 return width;
     }
     public double getLength() {
    	 return Length;
     }
     @Override
     public double getArea() {
    	 return this.width * this.Length;
     }
     @Override
     public String toString() {
    	 return "Rectangle[width = "+this.width+",length="+this.Length+","+super.toString()+"]";
     }
}
