//17. Write a program to generate StringIndexOutOfBoundsException 
package exercise14;

public class stringindexoutofbounds 
{
	
		   public static void main(String[] args) 
		   {
		      String str = "Hello how are you";
		      System.out.println("Length of the String: "+str.length());
		      
		      for(int i=0; i<str.length(); i++) 
		      {
		         System.out.println(str.charAt(i));
		      }
		      //Accessing element at greater than the length of the String
		      System.out.println(str.charAt(40));
		      
    /*Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 40
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
	at java.base/java.lang.String.charAt(String.java:1515)
	at exercise14.stringindexoutofbounds.main(stringindexoutofbounds.java:17)
*/
		   }
//In the following Java program, we are creating a String of length 17 and trying to print the element at the index 40.
	
}
