/**
 * 
 * 07. Create an interface and inherit it from the other interface.
 */

package exercise10;

interface Jala_7 //interface
{
    void methodOne();
}

interface Jala_07 extends Jala_7 //inherited interface
{
    void methodTwo();
}

class InheritedInterface implements Jala_07 {
    //override method of interface Jala_7
    @Override
    public void methodOne() 
    {
        System.out.println("This is first method");
    }
    
    //override method of inherited interface Jala_07
    @Override
    public void methodTwo() 
    {
        System.out.println("This is second method");
    }

    public static void main(String[] args) {
        
    	//creating obj of InheritedInterface
        InheritedInterface if7 = new InheritedInterface();
        
        //Calling the methods implemented
        if7.methodOne();
        if7.methodTwo();
    }
}

