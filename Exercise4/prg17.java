//17. Write a method to verify if the array contains two specified elements(12,23) 
package exercise4;
import java.util.*; 
import java.io.*; 


public class prg17 
{
	 public static void main(String[] args)
	 {
	    int arr[]= {12,23,44,56,23,12,59,70};
		System.out.println("Original Array: "+Arrays.toString(arr)); 
		int num1 = 12;
	    int num2 = 23;
		
		System.out.println("Result: "+ result(arr, num1, num2));
	 }	
	  
	  public static boolean result(int arr[], int num1, int num2) 
	  {
	    for (int number : arr) 
	    {
	    	boolean r = number != num1 && number != num2;
	    			if (r) 
	    			{
	    					return false;
	    			}
	    }
	        return true;
	   }
}


