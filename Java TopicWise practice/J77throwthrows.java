import java.text.NumberFormat.Style;

public class J77throwthrows {
    //here the throws keyword tell that the exception is handled by it caller and the caller is main method.
    void div(int a,int b) throws ArithmeticException
    {
        if(b==0)
        {
            //here we make userdefined or customized excepyion 
            throw new ArithmeticException();
        }
        else{
            int c=a/b;
            System.out.println(c);
        }
    }
    //the caller is main method and main method doesn't handle the exception it call to JVM then JVm handle this exception.
    public static void main(String [] args) //throws ArithmeticException
    {
        J77throwthrows t=new J77throwthrows();
        //t.div(20,0);
        //we can handle the exception in main method also like that
        try{
            t.div(20,0);
        }
        catch(ArithmeticException e )
        {
            System.out.println(e);
        }
        
    }
}
