package labsheett10;

public class Personal {
   private Person name;//object name reference class Person
   private Date bDay; //object bDay reference class Date
   //declare 1 private attribute
   private int personID;
   
   //default constructor
   //Postcondition: fristName ="",lastName =""
   //dMonth=1 ,dDay =1, and dYear= 1990
   //personID=0
   
   Personal(){
	name = new Person(); //fristName =  "", ;astName=""
	bDay = new Date(); //dMonth = 1.dDay=1, and dYear =1990
	personID = 0;
   }
   
   //Constructor with parameter
   Personal(String first , String last , int month , int day, int year, int ID){
	   name = new Person(first,last);; //firstName =first , lastName =last
	   bDay =  new Date(month,day,year);
	   personID =ID;
   }
   
   //Method to set the  personal information 
   //invoke set method from class person and class Date
   public void setPersonal(String first , String last , int month , int day, int year, int ID) {
	   name.setName(first, last);
	   bDay.setDate(month, day, year);
	   personID = ID;
   }
   //to return the string of personal information
   public String toString() {
	   return "Name:"+ name.toString() +"\n"+"Date of birth : "+bDay.toString()+"\n"+"personal ID : "+personID;
   }
   
   
   
   
   
}
