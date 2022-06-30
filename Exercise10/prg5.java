//Create two interfaces with the same method (same signature) in both the interfaces. 
//Implement these two interfaces in one class. Call the method. 

package exercise10;

interface Interfaceone
{
  public void myMethod(); // interface one method
}

interface Interfacetwo 
{
  public void myMethod(); // interface second method
}

// implement two interfaces in one class
class DemoClass5 implements Interfaceone, Interfacetwo
{
  public void myMethod() 
  {
    System.out.println("Some text..");
  }
  /*If two interfaces contain a method with the same signature 
  but different return types, 
  then it is impossible to implement both the interface simultaneously.**/
  
  
  /*public void myMethod() // Error: rename method MyMethod
  {
    System.out.println("Some other text...");
  }**/

}

public class prg5
{
  public static void main(String[] args)
  {
    DemoClass5 myObj = new DemoClass5();
    myObj.myMethod();
    //myObj.myOtherMethod();
  }
}


