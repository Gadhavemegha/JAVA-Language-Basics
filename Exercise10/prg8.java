/* Create a PUBLIC interface with fields and methods, fields should have values assigned. 
 * Implement this interface to some class and print the values of the interface fields  
 * and call the interface methods 
 * */
package exercise10;

		public interface world
			{
						String city = "Nashik";
						public void myworld();
			}
		public class prg8 implements world
		{
			public void myworld()
			{
				System.out.println("\n Lets travel the world together...");
			}
		
		
				public static void main(String args[])
				{
					prg8 p = new prg8();
					System.out.println(city);
					p.myworld();
				}
		}


