/*Exception-->An Exception is unexpected/unwanted/abnormal situation that occured at run time
 called exception.
 An Exception Handling , we should have an alternate source through which we can handle the 
 Exception.
 The object oriented mechanism has provided the following techniques to work with exception-->
 1>try 2>catch 3>throw 4>throws 5>finally
 Throwable class is the super or root class of java exception hierarchy which contains two sub classes
 that is---
 1>exception             2>error
 Exception--->
 1.RuntimeException
       #ArithmeticException
       #NullPointerException
       #NumberFormatException
       #IndexOutOfBoundsException
                ==StringIndexOutOfBoundsException
                ==ArrayIndexOutOfBoundsException      
       #ArrayIndexOutOfBoundsException
       #StringIndexOutOfException
 2.IUException
 3.SQLException
 4.InterruptedException
 5.ClassNotFoundException


 Error---->
 1.StackOverFlowError
 2.OutOfMemoryError
 3.IOError
 4.LinkageError
*/
public class J71Exception {
    public static void main(String [] args)
    {
        int a=10,b=0,c;
        try{
            c=a/b;
            System.out.println(c);
        }
        //ARithematic Exception
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
