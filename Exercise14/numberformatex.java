//16.Write a program to generate NumberFormatException 
package exercise14;

public class numberformatex 
{  
	/*basically caused because the input string is not well formatted 
	 * or illegal while parsing into a numerical value. 
	 * */
    private static final String inputString = "123.33";   
      
    public static void main(String[] args) 
    {  
        try 
        {  
                 int a = Integer.parseInt(inputString);  
        }
        catch(NumberFormatException ex)
        {  
            System.err.println("Invalid string in argumment");  
            //request for well-formatted string  
        }  
     }  
}  
