//11.Write a program to generate FileNotFoundException 
package exercise14;
import java.io.*;

public class filenotfoundex 
{
	public static void main(String args[])
	{
		//creating an instance of file reader class
		FileReader fileReader;
		try
		{
			fileReader = new FileReader("Test.txt"); 
			//// create instance of the BufferedReader and pass the FileReader instance to it.  
			BufferedReader bufferReader = new BufferedReader(fileReader);
		
			//declaring an empty string by passing null value
			String fileData = null;
			
			// use while loop to read and print data from buffered reader   
            try 
            {  
                while ((fileData = bufferReader.readLine()) != null)   
                {  
                    System.out.println(fileData);  
                }  
            }
            catch(IOException e)
            {
            		//TODO Auto generated catch block
            		e.printStackTrace();
            }
	}
		catch(FileNotFoundException e1)
		{
			//TODO Auto-generated catch block
			System.out.println("File not found....");
		}
	}
}
