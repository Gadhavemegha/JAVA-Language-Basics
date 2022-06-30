//Write a method for increment and decrement operators(++, --) 

package exercise2;

public class indc 
{
	public int increment(int a)
	{
		System.out.println(a++); //5
		System.out.println(++a); //7		
		return 0;
		
	}
	public int decrement(int a)
	{
		System.out.println(a--); //5
		System.out.println(--a); //3
		return 0;
	}
	public static void main(String args[])
	{
		indc a1 = new indc();
		a1.increment(5);
		a1.decrement(5);
	}
}
