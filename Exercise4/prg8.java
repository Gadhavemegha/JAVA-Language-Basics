//8. Write a function to find the minimum and maximum value of an array 
package exercise4;

public class prg8 
{
	public static void findmax(int arr[])
	{
		int max = arr[0];
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]> max)
			{
				max = arr[i];
			}
		}
		System.out.println("\n Maximum element in the given array is: " + max);
	}
	public static void findmin(int arr[])
	{
		int min = arr[0];
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("\n Maximum element in the given array is: " + min);
	
	}
	
	public static void main(String[] args) 
	{
		int[] arr = new int[] {2,3,4,5,6,7};
		findmax(arr);
		findmin(arr);
		
	}

}
