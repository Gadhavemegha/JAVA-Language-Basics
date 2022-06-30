/*
 * 1. Print the fields/instance members of the current class using this and without using object
 * 3. Call constructor of the current class using this()
 * 4. Call argument constructor of current class using this()
 */
package Exercise11;

public class prg1 
{

    int num; // instance variable
    String name; // instance variable

    prg1() //constructor
    {
        //3. Calling argument constructor of current class using this()
        this(11, "Sharan"); //print the fields of the current class using this
    }

    prg1(int num, String name) //argument constructor
    {
        //1. Printing fields of the current class using this
        this.num = num; //accessing variable using this keyword
        this.name = name; //accessing variable using this keyword
        System.out.println(num + " " + name);
        
    }

    public static void main(String[] args) 
    {
        prg1 ts1 = new prg1();
        prg1 ts = new prg1(12, "Jala");
    }
}
