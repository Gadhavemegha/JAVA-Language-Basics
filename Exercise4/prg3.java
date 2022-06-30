//3. Write a program to find the index of an array element 
package exercise4;

import java.util.Scanner;

public class prg3 
{
	public static void main(String args[])
	{
		int arr[] = new int [] {1,2,3,4,5,6,7,8,9,10};
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter the element:");
		int n = sc.nextInt();
		
		for(int i =0; i<arr.length; i++)
		{
			if (arr[i]==n)
			{
				System.out.println ("Index position of an array element: " + i);
			}
				
		}
			
	}
}
