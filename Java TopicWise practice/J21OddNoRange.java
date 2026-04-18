import java.util.Scanner;
public class J21OddNoRange {
    public static void main(String [] args)
    {
        int a;
        System.out.println("Enter no: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Odd No. Upto"+ a);
        for(int i=0; i<a;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i+" ");
            }
        }
        System.out.println("Even No. Upto"+ a);
        for(int i=0; i<a;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+" ");
            }
        }
    }
}

