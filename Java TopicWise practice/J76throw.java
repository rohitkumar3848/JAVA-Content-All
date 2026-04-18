/*throw keyword-->It is used to throw the userdefined or customized exception object to the JVM
 explicitly for that purpose we use throw keyword.
 throws Keyword-->It is used when we don't want to handle the exception,it send  to the JVM(JVM or other method).
 */
/*public class J76throw {
    //The throws keyword used with checked Exception.
    //Here we throw the exception to caller here the caller is JVM .The JVM handle the exception.
    public static void main(String [] args) throws InterruptedException
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }   
    
}*/
public class J76throw {
    //Here the exception can handle by user itself.
    public static void main(String [] args) 
    {
        for(int i=0;i<10;i++)
        {
            try{
                System.out.println(i);
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }            
        }
    }   
    
}
