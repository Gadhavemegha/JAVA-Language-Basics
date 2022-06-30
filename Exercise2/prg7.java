//7. Print the smaller and larger number 
package exercise2;

public class smalllarge 
{
	public void small()
	{
		int a = 2, b=3, c=5;
		
			if (a<b && a<c)
			{
				System.out.println("2 is smaller than 3 & 5");
			}
			else if (b<a && b<c)
			{
				System.out.println("3 is smaller than 2 & 5");
			}
			else
			{
				System.out.println(" 5 is smaller than 2 & 3");
			}
	}
	
	public void large()
	{
		int a = 2, b=3, c=5;
		
			if (a>b && a>c)
			{
				System.out.println("2 is lager than 3 & 5");
			}
			else if (b>a && b>c)
			{
				System.out.println("3 is larger than 2 & 5");
			}
			else
			{
				System.out.println("5 is larger than 2 & 3");
			}
	}

	public static void main(String[] args) 
	{
		smalllarge s1 = new smalllarge();
		s1.small();
		s1.large();
	}

}
