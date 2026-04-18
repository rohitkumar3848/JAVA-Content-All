import java.util.Scanner;
public class J08LargestAndSmallestNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        int max;
        max=a[0];
        for(int i=0;i<size;i=i+2)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(max);
        int min;
        min=a[0];
        for(int i=0;i<size;i=i+2)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
