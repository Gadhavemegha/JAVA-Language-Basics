//6. Write a program to create your own exception 
package exercise14;

	//class representing custom exception  
	class InvalidAgeException  extends Exception  
	{  
			public InvalidAgeException (String str)  
			//parameterized constructor of custom exception class
			{  
					// calling the constructor of parent Exception  
					super(str);  
			}  
	}  
 
	//class that uses custom exception InvalidAgeException  
	public class ownexception 
	{  

				// method to check the age  
				static void validate (int age) throws InvalidAgeException //method
				{    
				
						if(age < 18)
						{  
		
								// throw an object of user defined exception  
								throw new InvalidAgeException("age is not valid to vote");    
						}  
						else 
						{   
							     System.out.println("You are eligible to vote in the upcoming exception");   
						}   
				}    

	 // main method  
	 public static void main(String args[])  
	 {  
	     try  
	     {  
	         // calling the method   
	         validate(13);  
	     }  
	     
	     catch (InvalidAgeException ex)  
	     {  
	         System.out.println("Caught the exception");  
	 
	         // printing the message from InvalidAgeException object  
	         System.out.println("Exception occured: " + ex);  
	     }  
	
	     System.out.println("rest of the code...");    
	 }  
}  
