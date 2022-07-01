//14. Write a program to generate NoSuchMethodException  
package exercise14;

public class SpecialToday 
{
    private static String desert = "Chocolate Cake";

    
    /*public static String getDesert() 
    {
        return desert;
    }*/
    
    /*we’ll delete the method getDesert() in SpecialToday and recompile only this updated class. 
     * This time when we run our nosuchmethod, we notice the following runtime error:*/
}

public class nosuchmethod 
{
    public static void main(String[] args) 
    {
        System.out.println("Today's Specials: " + getSpecials());
    }

    public static String getSpecials() 
    {
        return SpecialToday.getDesert();
    }
    
    //Exception in thread "main" java.lang.NoSuchMethodError: SpecialToday.getDesert()Ljava/lang/String;
}
