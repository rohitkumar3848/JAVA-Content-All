import java.util.Scanner;
public class J14Switch {
    public static void main(String [] args)
    {
        /*Switch Statement: It is a multiple choice decision making statement, it used when we 
        want to select only once case out of multiplr cases.*/
        System.out.println("Check Character is vowel or consonant:");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter character");
        char c=sc.next().charAt(0);
        switch(c)
        {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break; 
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");   
        }
    }
}
