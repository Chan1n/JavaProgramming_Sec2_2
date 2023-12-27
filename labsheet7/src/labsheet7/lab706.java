package labsheet7;

import javax.swing.JOptionPane;

public class lab706 {

	public static void main(String[] args) {
	   int[] nums= {25,78,41,22,36,85,37};
	   
	   int indexNumb = Integer.parseInt(JOptionPane.showInputDialog("Input index of array :"));
	   
	   while(checkIndex(nums,indexNumb))
	   {
		   indexNumb = Integer.parseInt(JOptionPane.showInputDialog("Input index of array again:"));
	   }
       int currentNumber = currenData(nums,indexNumb); // method return value
       JOptionPane.showMessageDialog(null, "Current data,nums["+indexNumb+"] is"+ currentNumber);
       
      
	}//end of main()
	
	public static boolean checkIndex(int[] number, int index)
	{
		/*if ((index >=number.length)||(index<0))
		{
			return true;
		}
		else {
			return false;
		} */
		return ((index >=number.length)||(index<0))?true:false;
	}
	
	public static int currenData(int[] nums, int index) {
	return nums[index];	
	}
	public static int prevData(int[] nums, int index) {
		return nums[index-1];	
		}
	public static int NextData(int[] nums, int index) {
		return nums[index+1];	
		}
	
}
