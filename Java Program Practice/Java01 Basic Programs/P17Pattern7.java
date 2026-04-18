import java.util.Scanner;
//Hollow Rectangle-->
public class P17Pattern7 {
    public static void main(String [] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        char ch='A';
        for(int i=1;i<=n;i++)
        {
            
            for(int j=1;j<=n;j++)
            {
                if(i==1 || j==1 || j==n || i==n)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
