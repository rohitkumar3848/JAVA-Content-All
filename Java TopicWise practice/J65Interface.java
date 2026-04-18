/*Interface-->It is just like a class,which contains only abstract method.
-->To achieve interface we used implementds keyword.
-->Interface methods by default public and abstract.
-->Interface variables are by default public+static+final.
-->Interface methods are override compulsory inside the implementory class.
-->Interface nothing but deals between client and developer.
 */
import java.util.Scanner;
interface client{
    int x=1;//public+static+final
    void input();//public+abstract
    void output();//public+abstract
    //OR
    //public abstract void input();
}
class Developer implements client{
    String name;
    double salary;
    @Override
    public void input()//Public acess modifier must be declared for removing error weaker acess
    //bcz the weaker acess is default by default.
    {
        //int x=3;can't modified bcz the it is final and it is static bcz it can acessible every 
        //implementable class.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Username");
        name=sc.nextLine();

        System.out.println("Enter Salary");
        salary=sc.nextDouble();
    }
    /*If we doesn't write all abstract methods inside the sub class then the sub class automatically
     be abstract class.
     We can achieve like that first override single method of interface inside sub class and sub class is
     extends to its sub class then the other abstract method define inside it then by creating
     the object of sub class2 we can acess all abstract methods.*/
    @Override
    public void output()
    {
        System.out.println(" Name: "+name+" Salary "+salary);
    }
}
public class J65Interface {
    public static void main(String[] args)
    {
        client c1=new Developer();
        c1.input();
        c1.output();
        System.out.println(client.x);//x final is public so we aces like that.
    }
    
}
