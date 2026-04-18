import java.util.Scanner;
public class P06Fabonacci {
    public static void main(String [] args)
    {
        int n,n1=0,n2=1,temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. to find fabonacci series till that range");
        n=sc.nextInt();
        System.out.println("Fabonacci series  is:");
        System.out.print(n1+" "+n2+" ");
        for(int i=2;i<=n;i++)
        {
            temp=n1+n2;
            System.out.print(temp+" ");
            n1=n2;
            n2=temp;
        }
                    
    }
}
