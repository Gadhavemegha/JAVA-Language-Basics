/* 1.Write two methods with the same name but different number of parameters of same type 
 * and call the methods from main method  
2. Write two methods with the same name but different number of parameters of different 
data type and call the methods from main method  
3. Write two methods with the same name and same number of parameters of same type and 
call from main method  
4. Write two methods with the same name and same number of parameters of different type 
and call from main method   
5. Write two methods with the same name, number of parameters and data type but different 
return Type. 
 * */
package exercise13;

class methodoverloadingdemo
{
	//two methods with the same name but diff number of parameters
	void methodone(int a)
	{
		System.out.println("We are in Method no: " + a);
		
	}
	
	void methodone (String name, int age)
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	//2. two methods with the same name but different no. of parameters of diff data type
	//4. two methods with the same name and same number of parameters of different type 
	void methodtwo(int num1)
	{
			System.out.println("Age: " + num1);
	}
	void methodtwo(int num1, String name)
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + num1);
	}
	void methodtwo(String name, int num)
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + num);
	}
	//Error: Duplicate method methodtwo
	/*void methodtwo(int num1, String name)
	{} */
	//5. Write two methods with the same name, number of parameters and data type but 
	//different return Type. 
	/*Your code will result in a Compiler Error. 
	 * You can not have a Method of the same name with the same parameters 
	 * and a different return type, the caller would not know which Method 
	 * to call (will not be able to resolve the location in Memory of the Method to call, 
	 * why the Compiler would not allow it).
	 * */
	
	
}
public class methodoverloading 
{
	public static void main(String args[])
	{
		methodoverloadingdemo m1 = new methodoverloadingdemo();
		m1.methodone(5);
		m1.methodone("Megha", 25);
		m1.methodtwo(10);
		m1.methodtwo(27, "Mayur");
		m1.methodtwo("Varun", 27);
	}
}
