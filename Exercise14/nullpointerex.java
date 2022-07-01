//15. Write a program to generate NullPointerException 
package exercise14;
import java.io.*;

/*NullPointerException is a runtime exception in Java that occurs 
 * when a variable is accessed which is not pointing to any object and refers to nothing or null.
 * */
//A Java program to demonstrate that invoking a method on null causes NullPointerException

class nullpointerex
{
		public static void main (String[] args)
		{
			     // Initializing String variable with null value
			     String ptr = null;

			     // Checking if ptr.equals null or works fine.
			     try
			     {
			         // This line of code throws NullPointerException because ptr is null
			         if (ptr.equals("gfg"))
			         {
			             System.out.print("Same");
			         }
			         else
			         {
			             System.out.print("Not Same");
			         }
			     }
			     catch(NullPointerException e)
			     {
			         System.out.print("NullPointerException Caught");
			     }
		}
}
