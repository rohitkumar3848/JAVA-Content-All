public class J74Multipletry {
    public static void main(String [] args)
    {
        try{
            
            try{
                int []d={1,2,3,4,5};
                System.out.println(d[6]);

            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
                System.out.println("Exceed the array size limit");
            }
        
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
            
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("can't divide by zero");
            //catch block inside catch block
            try{
                String s=null;
                System.out.println(s.toUpperCase());
            }
            catch(NullPointerException x)
            {
                System.out.println(x);
                System.out.println("Null value can't be converted");   
            }
        }
        finally{
                System.out.println("I am in finally block 1");
                try{
                    int []d={1,2,3,4,5};
                    System.out.println(d[6]);
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println(e);
                    System.out.println("Exceed the array limit");
                }
                finally{
                    System.out.println("I am in finally block 2");
                }
        }
    }
}
