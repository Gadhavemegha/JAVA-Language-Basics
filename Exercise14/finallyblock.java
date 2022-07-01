//7. Write a program with finally block 
package exercise14;
import java.io.*;

	// Java program to demonstrate
	// finally block in java When
	// exception does not rise 
	  	class finallyblock 
	  	{
	  		public static void main(String[] args)
	  		{
	  				try //try block
	  				{
	  						System.out.println("inside try block");
	            
	  						// Not throw any exception
	  						System.out.println(34 / 0);
	  				}
	        
			        // Not execute in this case
			        catch (ArithmeticException e) 
			  		{
			            
			            System.out.println("Arithmetic Exception");
			            
			        }
	  				
	  				/* The finally block executes whether exception rise or not and whether exception handled or not.
	  				A finally contains all the crucial statements regardless of the exception occurs or not. */
	  				finally 
	  				{
	            
	  					System.out.println("finally : i execute always");
	  				}
	        }
	  }			
