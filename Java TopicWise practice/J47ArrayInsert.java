import java.util.*;
public class J47ArrayInsert {
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
        System.out.println("Enter the item of an array for inserting the new element");
        item=sc.nextInt();    
        for(int i=n-1;i>loc-1;i--)
        {
            a[i+1]=a[i];
        }
        a[loc-1]=item;
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" "); 
        }
    }    
}
