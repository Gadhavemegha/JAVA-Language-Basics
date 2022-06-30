//13. Write a method to find the second largest number in an array 

package exercise4;

public class prg13 
{
	public static void slargest(int a[])
	{
		int temp;
		for(int i=0; i<a.length; i++)
		{
			for(int j=1; j<a.length; j++)
			{
				if(a[j]>a[i])
				{
					a[i] = a[j];
					temp = a[i];
					a[j] = a[i];
				}
			}
		}
		System.out.println("\n Largest element is:" + a[0]);
	}
	public static void main(String args[])
	{
		int a[] = new int[] {10,20,60,90,30,40,50};
		slargest(a);
	}
}
