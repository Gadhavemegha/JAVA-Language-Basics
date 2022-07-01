/**
 * 3.Write a method which throws exception, Call that method in main class without try block
 */

package exercise14;
/* We can throw either checked or unchecked exceptions in Java by throw keyword.
It is mainly used to throw a custom exception. */
public class methodthrowsexception 
{
    static void throwException() //a method which throws exception
    {
        //throw keyword is used to invoke an exception explicitly.
        throw new RuntimeException("Throwing exception");
    }

    public static void main(String[] args) 
    {
        //Calling method in main class without try block
        throwException();
        /*Exception in thread "main" java.lang.RuntimeException: Throwing exception
			at exercise14.methodthrowsexception.throwException(methodthrowsexception.java:13)
			at exercise14.methodthrowsexception.main(methodthrowsexception.java:19)
         */
    }
}
