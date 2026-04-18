import java.util.Scanner;
public class J08Logical {
    public static void main(String [] args)
    {
        
        
        System.out.println("Logical Operations:");
        //Logical And
        System.out.println((10>5)&&(2>3));//False
        System.out.println((10>5)&&(3>2));//True
        //Logical OR
        System.out.println((4>5)||(2>3));//False
        System.out.println((10>5)||(2>3));//True
        //Logical Not
        System.out.println(!(10>5));//False
        System.out.println(!(5>10));//True
    }
    
}
