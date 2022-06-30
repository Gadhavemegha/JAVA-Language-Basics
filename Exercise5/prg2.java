//2. Print instance variables in static methods 
package exercise5;

public class prg2 
{
	int x = 10, y=20;
	
	public static void addition()
	{
		//int z = x + y;
		//cannot make static reference to non static field x
		//cannot make static reference to non static field x
	}
	public static void main (String args[])
	{
		addition();
	}
}
