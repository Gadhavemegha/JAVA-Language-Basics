/**
/ * 01. Create an abstract class with abstract and non-abstract methods.
 * 02. Create a subclass for an abstract class. Create an object in the child class for the
 * abstract class and access the non-abstract methods
 * 03. Create an instance for the child class in child class and call abstract methods
 * 04. Create an instance for the child class in child class and call non-abstract methods
 */
package exercise9;

	abstract class Games //abstract class
	{
			//An abstract method doesn't have its body
			abstract void sound(); //abstract method

			void play()//non-abstract method
		    {
					System.out.println("Megha is playing...");
			}
	}

		class Dance extends Games //Subclass of an abstract class
	{
			//provide implementation of abstract method
			void dancing() 
			{
					System.out.println("Megha is dancing gracefully.");
			}
	}
	
	public class prg1
	{
			public static void main(String[] args) 
			{
					Games g = new Dance();

					//accessing the non-abstract methods
					g.play();

					//instance for the child class
					Dance d = new Dance();
        
					//calling abstract methods
					d.dancing();
        
					//calling non-abstract methods
					d.play();
			}
	}
