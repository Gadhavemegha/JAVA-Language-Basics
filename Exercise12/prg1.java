/*1. Write a class with a default constructor, one argument constructor and two argument 
 * constructors. Instantiate the class to call all the constructors of that class from 
 * a main class 
 * */

package exercise12;


	class nashik
	{
		nashik()
		{
			System.out.println("\n Welcome to Nashik");
		}
		nashik(int temp)
		{
			System.out.println("\n Average temperature of nahsik is " + temp + " degree celcious");
		}
		nashik(int num, String quality)
		{
			System.out.println("\n Nashik has been cleanest city for the past " + num + " years");
			System.out.println("Nashik is the"  + quality + " city. ");
		}
	}
public class prg1 
{
	public static void main(String args[])
	{
		new nashik();
		new nashik(20);
		new nashik(5, "beautiful");
	}
}
