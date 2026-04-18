import java.util.Scanner;
public class J23CharInput {
    public static void main(String [] args)
    {
        char c;
        System.out.println("Enter Character");
        Scanner sc=new Scanner(System.in);
        c=sc.next().charAt(0);
        System.out.println("The entered Character is: "+c);
        int a=c;//Implicit conversion of char datatype in int datatype
        System.out.println("The Ascii value of entered Character is: "+a);
    }
}
