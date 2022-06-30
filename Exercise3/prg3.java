//3. Program to equal operator and not equal operators 
package exercise3;
import java.util.*; // to import scanner class

public class prg3 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in); //object creation of scanner class
		System.out.println("Enter any two numbers to check for equality: ");
		int num1=in.nextInt(); //accept input from user
		int num2=in.nextInt();
		
		if(num1==num2)
		{
			System.out.println("The two numbers are equal");
		}
		else if(num1!=num2)
		{
			System.out.println("The numbers are not equal");
		
		}
	}
}

