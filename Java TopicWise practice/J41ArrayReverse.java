import java.util.Scanner;
public class J41ArrayReverse {
    public static void main(String [] args)
    {
        int n;
        System.out.println("Enter Size of an array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Entered elements are: ");
        //Using for loop to array elements
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
        System.out.println("Reverse array elements are: ");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]+" ");
        }

    }    
}
