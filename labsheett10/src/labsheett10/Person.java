package labsheett10;
 
public class Person {
   //declare 2 private attributes
	private String firstName;
	private String lastName;
	
	//Default constructor
	//Initialize fristName and lastName to an empty string
	Person(){
		firstName = "";
		lastName = "";
	}
	
	//Constructor with parameters
	Person(String first , String last){
		firstName = first;
		lastName = last;
		setName(first,last);
	}
	
	//Method to set firstName and lastName according to parameters
	public void setName(String first , String last) {
		firstName = first;
		lastName = last;
	}
	
	//Method to return to firsName
	public String getFirstName() {
		return firstName;
	}
	
	//Method to return LastName
	public String getLastName() {
		return lastName;
		
	}
	//method to output the firstName and lastName
	public String toString() {
		return  firstName+" "+lastName;
	}
}
