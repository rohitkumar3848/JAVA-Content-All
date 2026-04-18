public class J50Recursion {
    int factorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    public static void main(String [] args)
    {
        J50Recursion a1=new J50Recursion();
        System.out.println("Factorial is--> "+a1.factorial(5));
    }
}
