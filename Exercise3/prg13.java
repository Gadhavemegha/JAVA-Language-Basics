//13. Program for multiple if else statement(Largest number  in 10,20 and 30) 
package exercise3;

public class prg13 
{

	public static void main(String[] args) 
	{
		int a=10, b=20, c=30;
		
		if(a>b && a>c)
		{
			System.out.println("10 is the largest number.");
		}
		else if(b>a && b>c)
		{
			System.out.println("20 is the largest number.");
		}
		else
		{
			System.out.println("30 is the largest number.");
		}
		
	}

}
