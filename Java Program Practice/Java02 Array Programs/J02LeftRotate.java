import java.util.Scanner;
public class J02LeftRotate {
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
            int j,first;
            first=a[0];
            for(j=0;j<size-1;j++)
            {
                a[j]=a[j+1];
            }
            a[j]=first;
        }
        System.out.println("\nLeft Rotate Array ::");
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
