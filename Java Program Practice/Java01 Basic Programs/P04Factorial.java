public class P04Factorial {
    public static void main(String [] args)
    {
        int n=3,fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        System.out.println("Factorial is:"+fact);            
    }
}
