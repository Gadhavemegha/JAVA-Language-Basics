//12. Converting Numbers to Strings with valueOf() 

package exercise6;

public class prg12 
{
	public static void main(String args[])
	{
		int i=200;  
		String s = String.valueOf(i);//converting numbers to strings with value of
		System.out.println(i+100);//300 because + is binary plus operator  
		System.out.println(s+100);//200100 because + is string concatenation operator  
	}
}
