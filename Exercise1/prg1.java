
// 1. How to create a class, object, method and its signature 

package exercise1;
public class basics //Class Creation
{
		int x = 10;
		
		static void mymethod()//method creation 
		{
			System.out.println("Hello world");
		}
		public int add(int a, int b)//signature method
		//The method signature consists of the method name and the parameter list.
		{
			System.out.println(a+b);
			return 1;
		}
	
	
		public static void main(String[] args) 
		{
				basics b1 =  new basics(); //object creation using class name
				System.out.println(b1.x);
				mymethod(); //calling method
				b1.add(5,10);
		}
}


