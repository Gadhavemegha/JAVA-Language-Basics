//6. Write a  program to print even number between 10 and 100 using while 
package exercise3;

public class prg6 
{
	public static void main(String args[])
	{
		int i=10;
		while(i<=100)
		{
			if(i % 2 == 0)
			{
				System.out.println("\t"+ i);
			}
			i++;
		}
	}
}
