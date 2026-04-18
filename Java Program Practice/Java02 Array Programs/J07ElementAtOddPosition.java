import java.util.Scanner;
public class J07ElementAtOddPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<size;i=i+2)
        {
            System.out.println(a[i]+" ");
        }
    }
}
