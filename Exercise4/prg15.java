//15. Write a method to find number of even number and odd numbers in an array 
package exercise4;
import java.util.Scanner;

public class prg15 
{
		public static void main(String[] args) 
		{
		        int n;
		        
		        Scanner s = new Scanner(System.in);
		        System.out.print("Enter no. of elements you want in array:");
		        
		        n = s.nextInt();
		        int a[] = new int[n];
		        
		        System.out.println("Enter all the elements:");
		        	for (int i = 0; i < n; i++) 
		        	{
		        			a[i] = s.nextInt();
		        	}
		        
		        System.out.print("Odd numbers:");
		        	for(int i = 0 ; i < n ; i++)
		        	{
		            	if(a[i] % 2 != 0)
		            	{
		            			System.out.print(a[i]+" ");
		            	}
		        	}
		        
		        System.out.println("");
		        System.out.print("Even numbers:");
		        	for(int i = 0 ; i < n ; i++)
		        	{
		        			if(a[i] % 2 == 0)
		        			{
		        					System.out.print(a[i]+" ");
		        			}
		        	}
		}
}
