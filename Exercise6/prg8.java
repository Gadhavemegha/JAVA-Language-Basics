//8.equalsIgnoreCase(), startsWith(), endsWith() and compareTo() 

package exercise6;

public class prg8 
{
	public static void main(String args[])
	{
		
		System.out.println("EQUALS...");
		String str1= new String("Hello");
		String str2= new String("Hi");
		String str3= new String("Hello");
		System.out.println("str1 equals to str2:"+str1.equals(str2)); //false
		System.out.println("str1 equals to str3:"+str1.equals(str3)); //true
		System.out.println("str1 equals to Welcome:"+str1.equals("Welcome")); //false
		System.out.println("str1 equals to Hello:"+str1.equals("Hello")); //true
		System.out.println("str1 equals to hello:"+str1.equals("hello")); //false
		
		System.out.println("equalsIgnoreCase()...");
		String sstr1= new String("Apple");
		String sstr2= new String("MANGO");
		String sstr3= new String("APPLE");
		System.out.println("str1 equals to str2:"+sstr1.equalsIgnoreCase(sstr2)); //false
		System.out.println("str1 equals to str3:"+sstr1.equalsIgnoreCase(sstr3)); //true
		System.out.println("str1 equals to Welcome:"+sstr1.equalsIgnoreCase("Welcome")); //false
		System.out.println("str1 equals to Apple:"+sstr1.equalsIgnoreCase("Apple")); //true
		System.out.println("str2 equals to mango:"+sstr2.equalsIgnoreCase("mango")); //true
		
		System.out.println("----startswith()----");
		String myStr = "Hello";
		System.out.println(myStr.startsWith("Hel"));   // true
		System.out.println(myStr.startsWith("llo"));   // false
		System.out.println(myStr.startsWith("o"));     // false
		
		System.out.println("----endswith()----");
		String myStr1 = "Hello";
		System.out.println(myStr1.endsWith("Hel"));   // false
		System.out.println(myStr1.endsWith("llo"));   // true
		System.out.println(myStr1.endsWith("o"));     // true
		
		String s1="hello";  
		String s2="hello";  
		String s3="meklo";  
		String s4="hemlo";  
		String s5="flag";  
		System.out.println("\n----Compareto()----");
		System.out.println(s1.compareTo(s2));//0 because both are equal  
		System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
		System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
		System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  
	}
}
