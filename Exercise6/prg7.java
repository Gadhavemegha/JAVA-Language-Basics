//7. Comparing strings using the methods equals(), 
package exercise6;

public class prg7 
{
	public static void main(String args[])
	{
		String myStr1 = "Hello";
		String myStr2 = "Hello";
		String myStr3 = "Another String";
		System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
		System.out.println(myStr1.equals(myStr3)); // false
	}
}
