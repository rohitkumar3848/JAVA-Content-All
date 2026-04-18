public class J73Multiplecatch {
    public static void main(String [] args)
    {
        try{
            int a=10,b=2,c;
            c=a/b;
            System.out.println(c);
            
            int []d={1,2,3,4,5};
            System.out.println(d[6]);
        
            String s=null;
            System.out.println(s.toUpperCase());
            
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("can't divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println(a);
            System.out.println("Exceed the limit of array");
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
            System.out.println("Null String can't onvert in uppercase");
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("All type of exception is occured");
        }
        finally{
            System.out.println("I am in finally block");
        }
    }
}
