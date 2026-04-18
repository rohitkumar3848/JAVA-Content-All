import java.util.Scanner;
public class J35Pallindrome {
    public static void main(String [] args)
    {
        int n,d,rev=0,org_num;
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        org_num=n;
        while(n>0)
        {
            d=n%10;
            rev=(rev*10)+d;
            n/=10;
        } 
        if(rev==org_num)
        {
            System.out.println("The Entered Number is Reverse Number");
        }
        else{
            System.out.println("The Entered Number is not Reverse Number");
        }
    }
    
}
