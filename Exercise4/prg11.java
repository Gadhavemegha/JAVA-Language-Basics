//11.  Write a program to find the common values between two arrays 
package exercise4;

public class prg11 
{
	public static void findcommon(int a1[], int a2[])
	{
		for (int i=0; i<a1.length; i++)
		{
			for (int j=0; j<a2.length; j++)
			{
				if(a1[i] == a2[j])
				{
					System.out.println ("Common elements are:" + a1[i] );
				}
			}
		}
	}
	public static void main(String args[])
	{
		int a1[] = new int[] {2,3,4,5,6,7,8};
		int a2[] = new int[] {4,5,6,7,8,9,3};
		findcommon(a1, a2);
		
		
	}
}
