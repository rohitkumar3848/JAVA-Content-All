import java.lang.Math;
import java.util.Scanner;
public class J36Armstrong {
    public static void main(String [] args)
    {
        int n,d,org_num,count=0;
        double sum=0;
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        org_num=n;
        while(org_num>0)
        {
            org_num/=10;
            count++;
        }
        org_num=n;
        while(n>0)
        {
            d=n%10;
            sum=sum+Math.pow(d,count);
            n/=10;
        } 
        if(sum==org_num)
        {
            System.out.println("The Entered Number is Armstrong Number");
        }
        else{
            System.out.println("The Entered Number is not Armstrong Number");
        }
    }
    
}
