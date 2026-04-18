import java.util.Scanner;
public class J39_Array {
    public static void main(String [] args)
    {
        int n;
        System.out.println("Enter Size of an array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Size of an array");
        //Using for loop to array elements
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
        //Using for-each loop yo print array elements
        for(int b:a)
        {
            System.out.println(b+" "); 
        }

    }    
}
