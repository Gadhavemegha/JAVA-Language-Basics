// 8. Write a program to generate Arithmetic Exception 
package exercise14;

public class arithmeticexceptionex 
{
		void divide(int a, int b)
		{
			int res = a/b;
			System.out.println("Result after division:"+ res);
		}
		
		//main method
		public static void main (String args[])
		{
			arithmeticexceptionex x = new arithmeticexceptionex();		
			x.divide(10, 0);
		}
}
