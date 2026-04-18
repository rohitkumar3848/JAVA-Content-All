import java.util.Scanner;
//Right Side Pattern Reverse-->
public class P19FloydsTriangle {
    public static void main(String [] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int val=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(val+" "); 
                val++;
            }
            System.out.println();
        }
    }
}
