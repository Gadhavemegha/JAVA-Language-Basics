//12. Print gender (Male/Female) program according to given M/F using switch 
package exercise3;
import java.util.*;

public class prg12 
{

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("\n Enter Gender M/F:");
		char ch = reader.next().charAt(0); //accepting string input from used
		
		switch(ch)
		{
			
				case 'm':
				case 'M':
				{
					System.out.println("Your gender is Female");
					break;
				}
				
				case 'f':
				case 'F':
				{
					System.out.println("Your gender is Male");
					break;
				}
		}
		

	}

}
