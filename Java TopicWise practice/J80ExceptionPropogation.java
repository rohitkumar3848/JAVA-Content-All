//Exception Propogation-->It is a technique through which we can handle the exception by caller method.
public class J80ExceptionPropogation {
    public static void main(String [] args)
    {
        try{
            m1();
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("The Exception is handled by main method... ");
        }
        
    }
    public static void m1()
    {
        m2();
    }  
    public static void m2()
    {
        System.out.println(10/0);
    }
}
