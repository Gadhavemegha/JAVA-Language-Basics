/*1.Create an interface with only one method and implement it in a class. 
 * Call the method implemented. 
 *2.Create an interface with two methods, 
 * but implement only one in a class. Call the method implemented. 
 * **/
	
/*1.Create an interface with only one method and implement it in a class. 
 * Call the method implemented. 
 *2.Create an interface with two methods, 
 * but implement only one in a class. Call the method implemented. 
 * 3.Use Interface instances to call the implemented method in the implemented class 
**/
		package exercise10;
		
		interface Animal //creating an interface
		{
			  public void animalSound(); // interface method (does not have a body)
			  public void sleep(); // interface method (does not have a body)
		}
		
		// Pig "implements" the Animal interface
		class Pig implements Animal //implementing interface in a class
		{
			public void animalSound() //implement method in a class
			{
			    // The body of animalSound() is provided here
			    System.out.println("The pig says: wee wee");
			}
			public void sleep() //Error: Add unimplemented methods
			{
			    // The body of sleep() is provided here
			    System.out.println("Zzz");
			}
	     }
		
		public class prg1
		{
			  public static void main(String[] args) 
			  {
			    Pig myPig = new Pig();  // Create a Pig object
			    myPig.animalSound();
			    myPig.sleep();
			  }
		}
			 
			 
		
