package labsheet6;
import java.util.*;
public class lab604 {
	
    static Scanner scan = new Scanner(System.in);
    static String studentId,strSubjectId;
    static int subjectId;
    
	public static void main(String[] args) {
		inputStudent();
	}
	
	
	public static void inputStudent() {
		do {
		System.out.print("Enter Student id : ");
		studentId = scan.next();
		System.out.print("Enter Subject Id : ");
		subjectId = scan.nextInt();
		
		strSubjectId = subjectId+"";
		}while(!(isLength(studentId,strSubjectId)));
		System.out.println();
		displayData(isITstudent(studentId),isITsubject(strSubjectId));
	}
	
	public static boolean isLength(String id, String sub_id) {
		if(id.length()==10&& sub_id.length()==7) {
			return true;
		}
		return false;
	}
	public static boolean isITsubject(String id) {
        if(id.substring(0,3).equals("21")&&id.substring(4,5).equals("1")) {
        	return true;
        }
        else {
        	return false;
        }
    }
    public static boolean isITstudent(String id) {
        if(id.substring(0,3).equals("211")&&id.substring(3,6).equals("311")) {
        	return true;
        }
        else {
        	return false;
        }
    }
    
    public static void displayData(boolean sid,boolean subid) {
    	if(sid) {
    		System.out.println("Stuen id : "+studentId+" 1st year studen in IT");
    	}
    	else {
    		System.out.println("Stuen id : "+studentId+" is not 1st year studen in IT");
    	}
    	if(subid) {
    		System.out.println("Enroll in courses for Year1");
    	}
    	else {
    		System.out.println("Not enroll in courses for year 1");
    	}
    }
 
 
}
