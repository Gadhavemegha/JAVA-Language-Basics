//9.  Trimming strings with trim() 
package exercise6;

public class prg9 
{
	public static void main(String args[])
	{
		String text = "       Hello World!        ";
		String result = text.trim();
		System.out.println("String before trimming: " + result);
		System.out.println("String after trimming: " + result);
		
		// trims the trailing and leading spaces
        String s = " geeks for geeks has all java functions to read  ";
        System.out.println(s.trim());
 
        // trims the leading spaces
        s = " Chetna loves reading books";
        System.out.println(s.trim());
	}
}
