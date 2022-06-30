//4. Write a program to print the odd and even numbers
package exercise3;
import java.util.*;

public class prg4 
{
	public static void main(String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("\n Enter the number:");
		int num = reader.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println(num + " is even number.");
		}
		else
		{
			System.out.println(num + " is odd number.");
		}
		
	}
}
