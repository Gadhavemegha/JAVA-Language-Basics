//13.  Converting integer objects to Strings 
package exercise6;

public class prg13 
{
	public static void main(String args[])
	{
		// Custom input integers
        int a = 1234;
        int b = -1234;
 
        // Converting integer to string
        // using toString() method
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
 
        // Printing the above strings that
        // holds integer
        System.out.println("String str1 = " + str1);
        System.out.println("String str2 = " + str2);
	}
}
