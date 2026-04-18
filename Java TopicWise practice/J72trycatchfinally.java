/*try block-->It is a block that contains only risky code.
catch block-->It is used to handle the exeception.
finally block-->It is realtime block and the main purpose of finally to handle the resources.
Execution--->
First, it execute the try block and checked exception if no ignore the catch block and execute the
finally block if the exception occurs then ignore the rest code of try block and 
execute the catch block then it ecexute the finally block.
If there is any exception ocuured in catch and finally block then it skip the rest code of both
block.
We can use multiple try block for handling multiple exception.
---->While working with multiple catch the super class exception catch block must be at the last
catch block.
 */
public class J72trycatchfinally {
    public static void main(String [] args)
    {
        try{
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
            
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("can't divide by zero");
        }
        try{
            int a[]={1,2,3,4,5};
            System.out.println(a[6]);
        }
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println(a);
            System.out.println("Exceed the limit of array");
        }
        finally{
            System.out.println("I am in finally block");
        }
    }
}
