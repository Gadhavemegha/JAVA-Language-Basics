//10.Replacing characters in strings with replace() 

package exercise6;

public class prg10 
{
	public static void main(String args[])
	{
		String s1="my name is Megha my name is java";  
		String replaceString = s1.replace("is","was");//replaces all occurrences of "is" to "was"  
		System.out.println(replaceString);  
	}
}
