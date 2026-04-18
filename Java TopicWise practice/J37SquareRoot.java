import java.util.Scanner;
import java.lang.Math;
public class J37SquareRoot {
    public static void main(String [] args)
    {
        int n;
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        double m=Math.sqrt(n); 
        System.out.println("The Square root is :"+m);
    }
    
}
