import java.util.Scanner;
//Butterfly Pattern-->
public class P28PrintZPattern {
    public static void main(String [] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1 || i==n)
                {
                    System.out.print("* ");
                }
                if(j==n-i+1)
                {
                    System.out.println("* ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
