//16. Write a function to get the difference of largest and smallest value 
package exercise4;
import java.util.Arrays; 

public class prg16 
{
	 public static void main(String[] args)
	 {
	    int arr[] = {10,20,30,40,50,60,70,80,90};
	    System.out.println("Original Array: "+Arrays.toString(arr)); 
	    int maxval = arr[0];
	    int min = arr[0];
	    for(int i = 1; i < arr.length; i++)
	    {
	        if(arr[i] > maxval)
	        {
	            maxval = arr[i];
	        }
	        else if(arr[i] < min)
	        {
	            min = arr[i];
	        }
	    }
	    System.out.println("Difference between the largest and smallest araay element is: "+(maxval - min));    
	
	 }
}
