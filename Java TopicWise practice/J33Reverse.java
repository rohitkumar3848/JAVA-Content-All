import java.util.Scanner;
public class J33Reverse {
    public static void main(String [] args)
    {
        int n,d,rev=0;
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            d=n%10;
            rev=(rev*10)+d;
            n/=10;
        } 
        System.out.println("The Reverse No. is :"+rev);
    }
    
}
