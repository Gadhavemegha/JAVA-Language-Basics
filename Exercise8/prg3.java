package exercise8;
/**
 * 3. Create a class with PROTECTED fields and methods. Access these fields and methods
 * from any other class in the same package.
 */

//class with private fields and method
public class prg3
{
    //Protected field
    protected String name;

    //Protected method
    protected void protectedMethod() 
    {
        System.out.println("This is a " + name);
    }
}

//Accessing protected fields and methods from other class in the same package
class protectedClass_03 
{
    public static void main(String[] args) 
    {
        //Creating object of ProtectedClassFieldsMethod class.
        prg3 pc = new prg3();
        
        //Accessing protected field
        pc.name = "Protected Method";
        
        //Accessing protected method
        pc.protectedMethod();
    }
}
