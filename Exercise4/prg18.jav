//18.Write a program to remove the duplicate elements and return the new array - incomplete
package exercise4;

public class prg18 
{
		  public static void main(String[] args) 
		  {
		        int nums[] = {20, 20, 30, 40, 50, 50, 50};  
				
				System.out.print("Array elements are: ");
				for (int i = 0; i < nums.length; i++)
		        {
		            System.out.print(nums[i]+" ");
		        }
					
		   }
		    
		    public static int remove(int[] nums) 
		    {
		        int index = 1;
		        for (int i = 1; i < nums.length; i++) 
		        {
		            if (nums[i] != nums[index-1])
		                nums[index++] = nums[i];
		        }
			  return index;
		    }
}
