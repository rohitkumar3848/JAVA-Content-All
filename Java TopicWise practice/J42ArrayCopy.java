import java.util.Scanner;
public class J42ArrayCopy {
    public static void main(String [] args)
    {
        int n,sum=0,s,flag=1;
        System.out.println("Enter Size of an array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter Search element of an array");
        s=sc.nextInt();
        int a[]=new int [n];
        int b[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        System.out.println("Copy the elments of an array a to b array");
        for(int i=0;i<n;i++)
        {
            b[i]=a[i];
            System.out.println(b[i]+" ");
        }
        //Sum Of Elements in array:
        System.out.println("Sum of elments is:"+sum);
        //Search the element in array
        for(int i=0;i<n;i++)
        {
            if(a[i]==s)
            {
                flag=0;
            }
        }
        if(flag==0)
        {
            System.out.println("The search Element is found");
        }
        else
        {
            System.out.println("The search Element is not found");
        }
    }    
}
