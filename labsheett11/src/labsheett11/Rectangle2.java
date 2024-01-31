package labsheett11;

public class Rectangle2 implements Shape2{

	 private double width;
     private double Length;
     
     Rectangle2(double width, double Length){
    	   // call attribute color from constructor method in class shape
    	 this.width = width;
    	 this.Length = Length;
     }
     
     public double getWidth() {
    	 return width;
     }
     public double getLength() {
    	 return Length;
     }
     public double getArea() {
    	 return this.width * this.Length;
     }
     
     public String toString() {
    	 return "Rectangle[width = "+this.width+",length="+this.Length+"]";
     }
}
