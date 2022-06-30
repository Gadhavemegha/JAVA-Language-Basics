//9. Create a PRIVATE or PROTECTED interface and print the values as above scenario 
//10.Create an interface with private, public and protected fields.  
//11. Create an interface with static final variable  

package exercise10;

interface demointerfaceone
{
	//interface with private, public and protected field
	public int num1 = 11;
    
    final int num3 = 33;
    //Illegal modifier for the interface field demointerfaceone
    //private int num4 = 44;  - error
    
    //protected int num5 = 55; - error
    //illegal modifier for interface
    
    static final int num2 = 22;
    //interface with static final variable
}
class prg9 implements demointerfaceone
{
		public static void main(String[] args) 
		{
        prg9 if9 = new prg9();
        System.out.println(if9.num1 + " " + if9.num2);
		}
}
