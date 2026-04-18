/*Static Block-->It is execute at the time of loading of.class file into JVM memory
and execute before instance block .
If we have multiple static block then the execution of static block depend upon their declarations.
Order Of Execution-->1.Static Block-->2.Instance Block-->3.Constructor 
*/
class A{
    int a,b;
    static int x,y;
    A()
    {
        a=30;
        b=40;
        System.out.println(a+" "+b);
    }//Static Block here execute first
    static{
        x=29;
        y=38;
        System.out.println(x+" "+y);

    }//2.Static Block
    static{
        x=290;
        y=380;
        System.out.println(x+" "+y);

    }
    //Instance Block here and it execute before the constructor.
    {
        a=20;
        b=30;
        System.out.println(a+" "+b);
    }
}
public class J57StaticBlock {
    public static void main(String[] args)
    {
        A a1=new A();
    }
    
}
