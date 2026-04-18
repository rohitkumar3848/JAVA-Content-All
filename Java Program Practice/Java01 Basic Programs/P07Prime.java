import java.util.Scanner;
public class P07Prime {
    public static void main(String [] args)
    {
        int a,b,flag=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.s to find Prime no. that range");
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(i<2)
            {
                continue;
            }
            flag=1;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.print(i+" ");  
            } 
        }                   
    }
}
