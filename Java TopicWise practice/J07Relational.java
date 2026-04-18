import java.util.Scanner;

public class J07Relational {
    public static void main(String[] args)
    {
        int a,b;
        System.out.println("Enter no: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();   
        b=sc.nextInt();
        System.out.println("True/False"+(a>b));
        System.out.println("True/False "+(a<b));
        System.out.println("True/False "+(a>=b));
        System.out.println("True/False "+(a<=b));
        System.out.println("True/False :"+(a==b));
        System.out.println("True/False :"+(a!=b));   
    }
}
