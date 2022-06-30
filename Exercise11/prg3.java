/**
 * 6. Use this() and super() in methods not in constructor
 */
package Exercise11;

					
			class demoparentclass //SuperClass
			{
			    void method1() 
			    {
			        System.out.println("I am the happiest soul on this planet");
			    }
			
			    void method2() 
			    {
			        
			        this.method1(); //using this() to call method1
			    }
			}
			//SubClass
			class demochildclass extends demoparentclass 
			{
			    void method3() 
			    {
			        //reference to parent class method
			        super.method2(); //using super() to call parent method
			    }
			}
			
			public class prg3 
			{
			    public static void main(String[] args) 
			    {
			        demochildclass c = new demochildclass();
			        //Calling method3
			        c.method3();
			    }
			}
