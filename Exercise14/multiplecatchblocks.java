//4.Write a program with multiple catch blocks 
//5.Write a program to throw exception with your own message 
package exercise14;

public class multiplecatchblack 
{
		  
	    public static void main(String[] args) 
	    {  
	          
		        try
		        {    
		                int a[]=new int[5];    
		                a[5]=30/0;    
		        }    
		               catch(ArithmeticException e)  
		                  {  
		                   System.out.println("Arithmetic Exception occurs");  
		                  }    
		               
		        		catch(ArrayIndexOutOfBoundsException e)  
		                  {  
		                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
		                  }    
		               
		        		catch(Exception e)  
		                  {  
		                   System.out.println("Parent Exception occurs");  
		                  }             
		               
		        System.out.println("rest of the code");    
		     
	    }
}
