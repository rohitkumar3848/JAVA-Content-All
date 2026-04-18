import java.util.Scanner;
public class P29MirrorMatrix {
    public static void main(String [] args)
    {
        int a[][]={{1,2},{3,4}};
        Scanner sc=new Scanner(System.in);
        /*System.out.println("Entered the array elments--> ");
        for(int i=0;i<=1;i++)
        {
            for(int j=0;i<=1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }*/
        System.out.println("The matrix is--> ");
        for(int i=0;i<=1;i++)
        {
            for(int j=1;i>=0;j--)
            {
                System.out.print(a[i][j]+" ");
            }
        }
    }
    
}
