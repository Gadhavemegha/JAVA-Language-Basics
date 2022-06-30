//1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance methods and a main method. 

package exercise5;

public class prg1 
{
	static int x = 10; //static variable
	static int y = 20; //static variable
	int num = 50; //instance variable
	String name = "megha"; //instance variable
	
	static void func(int z) // static method
	{
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			System.out.println("z = " + z);
	}
	static void add() //static method
	{
		int z = x + y;
		System.out.println("\n Addition:" + z);
	}
	
	public void display() //instance method
	{
		System.out.println("My name is:" + name);
	}
	public void addition()
	{
		int z = num + num;
		System.out.println("Addition is: " + z);
	}
	public static void main(String args[])
	{
		func(30);
		add();
		prg1 p = new prg1(); //object creation to call instance method
		p.display();
		p.addition();
	}
}
