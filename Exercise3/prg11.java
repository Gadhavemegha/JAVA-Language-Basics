//11.  Program to check whether a number is EVEN or ODD using switch 
package exercise3;

public class prg11 
{

	public static void main(String[] args) 
	{
			int num1=101;
			//int num2=111;
			
			switch(num1%2)//this will return 0
			{
				case 0:
				{
					System.out.println(num1 +" is an Even number");
					break;
				}
				case 1:
				{
					System.out.println(num1 +" is an Odd number");
					break; 
				}
			}
	}

}
