/**
 * 2. Print the fields/instance members of the parent class using super
 * 5. Call constructor of the parent class using super()
 */
package Exercise11;


		//SuperClass
		class Parentclass 
		{
		    String name = "Megha";
		
		    Parentclass() //parent class constructor
		    {
		        System.out.println("This is parent class constructor");
		    }
		}

		
		//SubClass
		class Childclass extends Parentclass 
		{
		    String name = "Mayur";
		
		    Childclass() //childclass constructor
		    {
		        super(); //Calling constructor of the parent class using super()
			       
		        System.out.println("This is child class constructor");
		    }
		
		    void myMethod() 
		    {
		        //Printing fields of the parent class using super
		        System.out.println("My name is " + super.name);
		    }
		}
		
		public class prg2 
		{
		    public static void main(String[] args) 
		    {
		        Childclass c = new Childclass();
		        c.myMethod();
		    }
		}
