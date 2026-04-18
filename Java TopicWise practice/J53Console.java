import java.io.Console;

/*Console:It is a predefined class that it is available in or import from i/o pacakage.
It is used to get input from user at runtime or security purpose.
It consistes two methods-->
1.readline();
2.readPassword();//It doesn't show whatever we entered in password,we can see using valueOf method.
Syntax--> conole obj=Sytem.console();
 */
import java.io.*;
public class J53Console {
    public static void main(String[] args){
    String str;
    char a[];
    Console obj=System.console();
    System.out.print("Enter Username: ");
    str=obj.readLine();
    System.out.print("Enter Paasword: ");
    a=obj.readPassword();
    String b=String.valueOf(a);
    System.out.println("Username: "+str);
    System.out.println("Password: "+a);
    //System.out.println("Password: "+b);
    }

    
}
