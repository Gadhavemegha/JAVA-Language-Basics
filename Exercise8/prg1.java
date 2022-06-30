/**
/
 *
 * 1. Create a class with PRIVATE fields, private method and a main method. Print the fields
 * in main method. Call the private method in main method.
 * - Create a subclass and try to access the private fields and methods from subclass
 */

package exercise8;

//class with private fields and method

	public class prg1
	{
		//private fields
		private String name = "Megha";//private fields
		private int age = 25;//private fields

		//private method
    
				private void pvtMethod() //private method
				{
						System.out.println("My Name is " + name + " and my age is " + age);
				}
    

		//main method
	
				public static void main(String[] args) 
    {
        prg1 obj = new prg1();
        //Printing the fields in main method
        System.out.println(obj.age); //print the fields in the main method
        System.out.println(obj.name); //print the fields in the main method
        //Calling the private method in main method
        obj.pvtMethod();
    }
    // NOTE : A subclass does not inherit the private members of its parent class
}
