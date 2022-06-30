//10. Write a function to find the duplicate values of an array 
package exercise4;

public class prg10 
{
	public static void find (int arr[])
	{
		for (int i = 0; i< arr.length; i++)
		{
			for (int j = i + 1 ; j< arr.length; j++)
			{
				if (arr[i] == arr[j])
				{
					System.out.println("Duplicate element found are:"+ arr[j]);
				}
			}
		}
		
	}

	public static void main(String[] args) 
	{
		int arr[] = new int[] {2,3,4,4,2,3,5,8,9,3,7,6,1,1};
		find(arr);
	}

}
