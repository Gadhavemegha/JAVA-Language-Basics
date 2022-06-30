//4. Create two interfaces with one method each. 
//Implement these two interfaces in one class
package exercise10;

	interface FirstInterface 
	{
	  public void myMethod(); // interface one method
	}

	interface SecondInterface 
	{
	  public void myOtherMethod(); // interface second method
	}

	// implement two interfaces in one class
	class DemoClass implements FirstInterface, SecondInterface 
	{
	  public void myMethod() 
	  {
	    System.out.println("Some text..");
	  }
	  public void myOtherMethod() 
	  {
	    System.out.println("Some other text...");
	  }
	}

	public class prg4
	{
	  public static void main(String[] args)
	  {
	    DemoClass myObj = new DemoClass();
	    myObj.myMethod();
	    myObj.myOtherMethod();
	  }
	}

