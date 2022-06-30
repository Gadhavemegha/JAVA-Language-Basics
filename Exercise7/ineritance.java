//1. A, B and C are classes  
//2. A is a super class. B is a sub class of A. C is a sub class of B.   
//3. Create three methods in each class, 2 methods are specific to each class and third method (override method) should be in all three Classes A, B and C  
//4. Create a class with main method. Create an object for each class A, B and C in main method and call every method of each class using its own object/instance.  
//5. Call an overridden method with super class reference to B and C class’s objects  
//6. Runtime Polymorphism with Data Members/Instance variables,Repeat the above process only for data members 

package exercise7;

class A
{
	public void additiona() //method specific to each class
	{
		int a = 10, b= 20;
		int c = b+a;
		System.out.println("\n Addition:" + c);
	}
	public void substractiona() //method specific to class
	{
		int a = 10, b= 20;
		int c = b-a;
		System.out.println("\n Substraction:" + c);
	}
	void run() //method overriding
	{
		System.out.println("\n Bike is running safely");
	}
}
class B extends A
{
	public void additionb() //method specific to each class
	{
		int a = 100, b= 200;
		int c = b+a;
		System.out.println("\n Addition:" + c);
	}
	public void substractionb() //method specific to class
	{
		int a = 100, b= 200;
		int c = b-a;
		System.out.println("\n Substraction:" + c);
	}
	void run()//method overriding
	{
		System.out.println("\n Vehicle is running safely");
	}
}
class C extends B
{
	public void additionc() //method specific to each class
	{
		int a = 1000, b= 2000;
		int c = b+a;
		System.out.println("\n Addition:" + c);
	}
	public void substractionc() //method specific to class
	{
		int a = 1000, b= 2000;
		int c = b-a;
		System.out.println("\n Substraction:" + c);
	}
	void run() //method overriding
	{
		System.out.println("\n Car is running safely");
	}
}
public class inheritance 
{
	public static void main(String args[])
	{
		A a1 = new A();
		a1.additiona();
		a1.substractiona();
		a1.run();
		
		B b1 = new B();
		b1.additionb();
		b1.substractionb();
		b1.run();
		
		C c1 = new C();
		c1.additionc();
		c1.substractionc();
		c1.run();
		
		b1.additiona(); //Call an overridden method with super class reference to B and C class’s objects
		c1.substractiona();//Call an overridden method with super class reference to B and C class’s objects
		
	}
}
