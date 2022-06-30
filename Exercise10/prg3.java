//3. Use Interface instances to call the implemented method in the implemented class. - Incomplete
package exercise10;


interface In1 //simple interface
{
	    // public, static and final
	    final int a = 10;
	  
	    // public and abstract
	    void display();//Interface method
}
  
// A class that implements the interface.
class TestClass implements In1 
{
    
	    // Implementing the capabilities of
	    // interface.
	    public void display() //implemented method
	    { 
	      System.out.println("JAVA"); 
	    }
  
    // Driver Code
    public static void main(String[] args)
    {
        TestClass t = new TestClass();
        t.display(); // call the implemented method in implemented class
        System.out.println(a);
    }
}
