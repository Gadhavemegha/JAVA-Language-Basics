/**
 * 3. Apply private, public, protected and default access modifiers to the constructor
 * 4. Write constructors with return type int and String
 * 5. Try to call the constructor multiple times with the same object
 */

package exercise12;

public class prg3
{
		    int rollNo;
		    String name;
		    String clg;
		    String city;

		    {
		    		System.out.println("Student Details");
		    }
    
		    //default access modifier
		    prg3() 
		    {
		        this(11);
		    }

		    //public access modifier
		    public prg3(int rollNo) 
		    {
		        this("Megha");
		        this.rollNo = rollNo;
		        System.out.println("rollNo : " + rollNo);
		    }

		    //private access modifiers
		    private prg3(String name) 
		    {
		        this("ICFAI", "Hyderabad");
		        this.name = name;
		        System.out.println("Name : " + name);
		    }

		    //protected access modifiers
		    protected prg3(String clg, String city) 
		    {
		        this.clg = clg;
		        this.city = city;
		        System.out.println("college : " + clg);
		        System.out.println("City : " + city);
		    }

		    public static void main(String[] args) 
		    {
		        //calling the constructor multiple times with the same object
		        prg3 c = new prg3();
		    }
    // NOTE : 4.Constructor looks like method but it is not. It does not have a return type
}
