//2. Write a function to calculate the average value of an array of integers 
package exercise4;

public class prg2 
{
	public static void main(String args[])
	{
		int arr[] = new int [] {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			sum = sum + arr[i];
		}
		double avg = sum/arr.length;
		System.out.println("Average value:"+ avg);
	
	}
	
}
