import java.util.Scanner;
public class J46ArrayMaxMin {
    public static void main(String [] args)
    {
        int n,max=0,min=0;
        System.out.println("Enter Size of an array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        max=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("The maximum Element in the array:"+max);
        min=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("The maximum Element in the array:"+min);

    }
}
