import java.util.Scanner;
public class J31Factor {
    public static void main(String [] args)
    {
        int n;
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("The Factor of "+n+" are follows ");
        for(int i=1;i<=n;i++)
        {
            if(n%2==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
