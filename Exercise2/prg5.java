//5. Programs on Logical AND,OR operator and Logical NOT 
package exercise2;

public class logicalopr 
{
	public static void main (String args[])
	{
		
		int a = 10, b = 20, c = 30;
		
		if ((a < b) && (b < c))
		{
			System.out.println("Both the conditions are true");
		}
		else if ((a > b) ||( a < b))
		{
			System.out.println("one or both the conditions are true");
		}
	}
	
}
