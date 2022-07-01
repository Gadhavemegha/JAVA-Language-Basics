/**
 * 02. Call the constructors(both default and argument constructors) of super class from a child
 * class
 */
package exercise12;

//Java program to demonstrate the concepts of constructor
//overloading.

	//Base Class or super class
	class Programming 
	{
	
			 // Creating Constructor for
			 // class Programming.
			 public Programming() //default constructor
			 {
			     System.out.println("Programming");
			 }
			
			 // Parameterized Constructor
			 public Programming(int i, int j)
			 {
			     System.out.println("Programming + +");
			 }
	}

//Child Class
class DP extends Programming 
{

				 public DP()
				 {
				     // Calling by using
				     // Programming(int i,int j)
				     // from class Programming.
				     super(10, 20);
				     System.out.println("DP");
				 }

			  // Parameterized Constructor for class DP
				 public DP(int i, int j)
				 {
					 	 super(); //calling parameterized constructor of base class
					     System.out.println("DP + +");
				 }
}

//Main Class
public class prg2 
{
		 public static void main(String[] args)
		 {
		     // Creating Object for class DP.
		     DP obj = new DP(); //calling default constructor
		     new DP(12,45); //calling parameterized constructor
		 }
}
