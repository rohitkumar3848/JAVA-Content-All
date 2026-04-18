import java.util.Scanner;
import java.lang.Character;

public class J29CharLowercaseUppercase {
    public static void main(String [] args)
    {
        char c,ch1;
        System.out.println("Enter Character");
        Scanner sc=new Scanner(System.in);
        c=sc.next().charAt(0);
        if(c>='A' && c<='Z')
        {
            ch1=Character.toLowerCase(c);
            System.out.println("LowerCase :"+ch1);
        }
        else{
            ch1=Character.toUpperCase(c);
            System.out.println("UpperCase :"+ch1);
        }
    }
}
