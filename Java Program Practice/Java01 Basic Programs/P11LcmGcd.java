import java.util.Scanner;
public class P11LcmGcd {
    public static void main(String [] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        float max;
        max=(a>b)?a:b;
        while(max<=a*b)
        {
            if(max%a==0 && max%b==0)
            {
                System.out.println("LCM is:"+max);
                break;
            }
            max++;
        }
        System.out.println("GCD is:"+(max/(a*b)));
    }
}
