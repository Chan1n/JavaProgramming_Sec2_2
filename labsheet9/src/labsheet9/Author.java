package labsheet9;

public class Author {
   private String name;
   private String email;
   private char gender;
   
   public Author(String name, String email , char gender) {
	   this.name = name;
	   this.email = email;
	   this.gender = gender;
   }
   public Author(String name,String email) {
	   this(name,email,' ');
   }
   public Author() {
	   this("","",' ');
   }
   public  String getName() {
	  return this.name;   
   }
   public String getEmail() {
	   return this.email;
   }
   public String getgenderName(){
	   if(gender == 'm') {
		   return"Male";
	   }
	   else if (gender == 'f') {
		   return "female";
	   }
	   else {
		   return null;
	   }
   }
   public String toString() {
	   return "Author name: ["+this.name+"]("+this.email+"];["+getgenderName()+"]";
   }
}
