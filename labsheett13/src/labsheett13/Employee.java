package labsheett13;
import java.io.*;
import java.util.*;
public class Employee {
   private String dept;
   
public void setDept(String dept) {
	   this.dept = dept;	
	  }
 public String getDept() {
	 return this.dept;
	
 }
 public  void header() {
	 //System.out.println("*******************")
	 for(int i=1;i<80;i++) {
		 System.out.print("*");
	 }
	 System.out.println();
 }
}
