import java.util.*;
public class J44Arraysmethods {
    public static void main(String [] args)
    {
        int n;
        System.out.println("Enter Size of an array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int [n];
        int a1[]=new int [n];
        System.out.println("Enter 1st array elments");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter 2nd array elments");
        for(int i=0;i<n;i++)
        {
            a1[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
        boolean b=Arrays.equals(a, a1);
        System.out.println("Both Arrays Equal or not"+b);
        int a2[]=Arrays.copyOf(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.println(a2[i]+""); 
        }
    }    
}
