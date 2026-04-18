import java.util.*;
public class J48ArrayDelete {
    public static void main(String [] args)
    {
        int n,loc,item;
        System.out.println("Enter Size of an array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int [n+1];
        System.out.println("Enter 1st array elments");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the location of an array for inserting the new element");
        loc=sc.nextInt();    
        for(int i=loc-1;i<n-1;i++)
        {
            a[i]=a[i+1];
        }
        for(int i=0;i<n-1;i++)
        {
            System.out.println(a[i]+" "); 
        }
    }    
}
