import java.util.Scanner;
public class J26Power {
    public static void main(String [] args)
    {
        int a,p,result=1;
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter power");
        p=sc.nextInt();
        for(int i=1;i<=p;i++)
        {
            result*=a;
        }
        System.out.println("The result is "+result);
    }
}
