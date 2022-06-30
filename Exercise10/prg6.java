/*6. Create an interface with a default method and implement it in a class. 
 * Do not provide implementation to the default method and call the method. 
 **/

package exercise10;
 
interface demointerface //interface with default method
{
	default void play() // default method
	{
			System.out.println("\n I want to pay cricket today");
	}
}

class prg6 implements demointerface
{
	public static void main (String args[])
	{
		prg6 p = new prg6(); 
		p.play(); //calling default method
	}
}

