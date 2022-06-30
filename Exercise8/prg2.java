/**
 * 2. Create a class with DEFAULT fields and methods. Access these fields and methods
 * from any other class in the same package
 */

package exercise8;
//class with default fields and methods

class defaultclass 
{
    
    int myAge; //Default fields
    String myName; //Default fields

    void defaultMethod() //Default method
    {
        System.out.println("My name is " + myName + " and my age is " + myAge);
    }
}

//Accessing default fields and method from other class in the same package
public class prg2
{
    public static void main(String[] args) 
    {
        //Creating object of DefaultClass_02.
        defaultclass obj = new defaultclass();
        
        //Accessing default fields
        obj.myAge = 25;
        obj.myName = "Megha";
        
        //calling default method
        obj.defaultMethod();
    }
}
