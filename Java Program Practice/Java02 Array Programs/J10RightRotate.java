import java.util.Scanner;
public class J10RightRotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Original Array ::");
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("\nHow much time you want to rotate an aray  : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int j,last;
            last=a[size-1];
            for(j=size-1;j>0;j--)
            {
                a[j]=a[j-1];
            }
            a[0]=last;
        }
        System.out.println("\nRight Rotate Array ::");
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
