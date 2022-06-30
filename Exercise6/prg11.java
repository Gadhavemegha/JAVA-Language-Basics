//11. Splitting strings with split() 
package exercise6;

public class prg11 
{
	public static void main(String args[])
	{
		String text = "Java is a fun programming language";

	    // split string from space
	    String result[] = text.split(" ");


	    System.out.print("result = ");
	    for (String str : result) 
	    {
	    	System.out.print(str + ", ");
	    }
	}
}
