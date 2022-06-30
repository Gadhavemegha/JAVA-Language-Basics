package exercise4;

import java.util.Arrays;
import java.util.Scanner;
import org.apache.commons.lang3.ArrayUtils;

public class prg12 
{
		public static void main(String args[]) 
		{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the size of the array that is to be created::");
      
				int size = sc.nextInt();
				
				int arr[] = new int[size];
      
				System.out.println("Enter the elements of the array ::");
					
					for(int i=0; i<size; i++) 
					{
						arr[i] = sc.nextInt();
					}
				
				System.out.println("The array created is ::"+Arrays.toString(arr));
				
				for(int i=0; i<arr.length-1; i++) 
				{
						for (int j=i+1; j<arr.length; j++) 
						{
								if(arr[i] == arr[j]) 
								{
									 arr = ArrayUtils.remove(arr, j);
								}
						}
				}
				System.out.println("Array after removing elements ::"+Arrays.toString(arr));
   }
}
