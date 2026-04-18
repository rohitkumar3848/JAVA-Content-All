import java.util.Scanner;
public class J22SumEvenOdd {
    public static void main(String [] args)
    {
        int a,sum1=0,sum2=0;
        System.out.println("Enter no: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(int i=0; i<a;i++)
        {
            if(i%2==0)
            {
                sum1+=i;
            }
            else
            {
                sum2+=i;
            }
        }
        System.out.println("The sum of even no inside this range is :"+sum1);
        System.out.println("The sum of Odd no inside this range is :"+sum2);
    }
}

