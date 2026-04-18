import java.util.Scanner;
public class J20EvenOdd {
    public static void main(String [] args)
    {
        int a;
        System.out.println("Enter no: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("Even No. "); 
        }
        else
        {
            System.out.println("Odd No. "); 
        }
    }
}
