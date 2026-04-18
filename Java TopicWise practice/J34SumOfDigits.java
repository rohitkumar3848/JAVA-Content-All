import java.util.Scanner;
public class J34SumOfDigits {
    public static void main(String [] args)
    {
        int n,d,sum=0;
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            d=n%10;
            sum+=d;
            n/=10;
        } 
        System.out.println("The Sum Of Digits is :"+sum);
    }
    
}
