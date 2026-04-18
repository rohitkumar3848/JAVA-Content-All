import java.util.Scanner;
public class J43SortAsc {
    public static void main(String [] args)
    {
        int n,temp=0;
        System.out.println("Enter Size of an array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])//For Descending order:use this if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
        }
        //Sorted Elements Are in Ascending order
        System.out.println("The sorted elements are:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }    
}
