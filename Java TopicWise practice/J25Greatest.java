import java.util.Scanner;
public class J25Greatest {
    public static void main(String [] args)
    {
        int a,b,c,max;
        System.out.println("Enter 3 Numbers to check which one is greater :");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        max=(((a>b)?a:b)>b)?b:c;
        System.out.println("The maximum Number is among them: "+max);
    }
}
