//9. Write a function to reverse an array of integer values 

package exercise4;

public class prg9 
{
	public static void reversearr(int arr[])
	{
		System.out.println("Length of an array is:" + arr.length);
		System.out.println("\n Array in reverse order:");
		for(int i=arr.length-1; i>= 0; i--)
		{
			System.out.println(arr[i] + " ");
		}
	}
	public static void main(String[] args) 
	{
		int arr[] = {2,4,6,8,9,12,15};
		
		System.out.println("\n Original Array:");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i] + " ");
		}
		reversearr(arr);
	}

}
