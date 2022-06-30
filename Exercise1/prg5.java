
//5. Define the local and Global variables with the same name and print both variables and understand the scope of the variables 
package exercise1;
public class localglobal 
{
	int a = 10; //global variable
	static void local() 
	{
		int a = 11; //Local Variable
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
		
		localglobal l1 = new localglobal();
		System.out.println(l1.a);
		local();
	}

}


