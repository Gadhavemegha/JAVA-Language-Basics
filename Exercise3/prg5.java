//5.Write a program to print largest number among three numbers. 
package exercise3;

import java.util.Scanner;

public class prg5 
{
	public static void main(String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("\n Enter 3 numbers:");
		int num1= reader.nextInt();
		int num2= reader.nextInt();
		int num3= reader.nextInt();
		
		if (num1>num2 && num1>num3)
		{
			System.out.println(num1+" is the largest number.");
		}
		else if (num2>num1 && num2>num3)
		{
			System.out.println(num2+" is the largest number.");
		}
		else
		{
			System.out.println(num3+ " is the largest number. ");
		}
		
	}
}
