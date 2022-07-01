/* 1. Write a program to generate Arithmetic Exception without exception handling  
2. Handle the Arithmetic exception using try-catch block */
package exercise14;

public class arithmeticexceptiontrycatch 
{
		   public static void main(String args[])
		   {
			  int num1=30, num2=0;
			  int output;
		      try
		      {
		    	 System.out.println("Your are inside a try block");
		         
		         output=num1/num2;
		         
		         System.out.println ("Result: "+output);
		      }
		      catch(ArithmeticException e)
		      {
		         System.out.println ("You Shouldn't divide a number by zero");
		      }
		      
		      System.out.println("Without Exception Handling");
		      output = num1/num2;
		      
		     //Error: Exception in thread "main" java.lang.ArithmeticException: /by zero
		   }

}
