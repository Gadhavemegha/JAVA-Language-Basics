package exercise2;


public class arithprogram 
{
	public int add(int a, int b)
	{
		int c = a+b;
		System.out.println("Addition:"+ c);
		return 0;
	}
	
	public int sub(int a, int b)
	{
		int c = a-b;
		System.out.println("Substraction:"+ c);
		return 0;
	}

	public int mult(int a, int b)
	{
		int c = a*b;
		System.out.println("Multiplication:"+ c);
		return 0;
	}

	public int div(int a, int b)
	{
		int c = a/b;
		System.out.println("Division:"+ c);
		return 0;
	}

	public static void main(String[] args) 
	{
		arithprogram a1 = new arithprogram();
		a1.add(8, 2);
		a1.sub(10, 5);
		a1.mult(5, 3);
		a1.div(15, 3);
	}

}
