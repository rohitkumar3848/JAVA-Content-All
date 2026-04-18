import java.util.Scanner;
public class J27CountDigit {
    public static void main(String [] args)
    {
        int n,digit=0;
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            n/=10;
            digit++;
        } 
        System.out.println("The no.of digit is :"+digit);
    }
}
