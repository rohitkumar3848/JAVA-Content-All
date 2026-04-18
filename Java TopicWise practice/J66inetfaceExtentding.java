/*interface--interface-->use extends-----------
Before JDK 1.8(Interface is 100% pure abstract methods) interface can only have abstract
methods and all the abstract methods of interface must be overriden
in implementing class as well as methods are public and abstract methods.
From JDK 1.8(Interface combo of abstract and default and static methods) onwards interface can have default and static methods.
Ex-->
interface A{
    //1.7V
    void a1();
    int a=10;
    +
    //1.8V
    default void m2(){----it may be override};
    static void m3(){---it can't override};
    +
    //1.9V
    private default/static void m4(){---- it can only acesible for extending class.};
}

*/
interface Rohit
{
    void add();
}
interface Rahul extends Rohit{
    void sub();
}
class Ayush implements Rahul{
    @Override
    public void add(){
        int a=10;int b=10;
        System.out.println("Addition "+(a+b));
    }
    @Override
    public void sub(){
        int a=10;int b=10;
        System.out.println("Subtraction "+(a-b));
    }
}
interface a{
    void a1();
    void a2();
    private void privateMethod()
    {
        System.out.println("Private Method");
    }
    private static void privateMethod2()
    {
        System.out.println("Private Method2");
    }
    default void a3()//default method
    {
        //by deafault method we can invoke the private mthod of interface.
        privateMethod();
        System.out.println("The default method of a interface.");
    }
    public static void show()
    {
        privateMethod2();
        System.out.println("Can't override the static methods.");
    }
    
}
class b implements a{
    public void a1(){
        System.out.println("The a1 abstract method of b class.");
    }
    public void a2(){
        System.out.println("The a2 abstract method of b class.");
    }
    public void a3()//Acess modifier must be greater than the acess modifier of default method.
    {
        System.out.println("The default method implementing in class b.");
    }
}
class c implements a{
    public void a1(){
        System.out.println("The c1 abstract method of c class.");
    }
    public void a2(){
        System.out.println("The c2 abstract method of c class.");
    }
    /*public void a3()//Acess modifier must be greater than the acess modifier of default method.
    {
        System.out.println("The default method implementing in class c.");
    }*/
}
public class J66inetfaceExtentding {
    public static void main(String [] args)
    {
        Rahul r1=new Ayush();
        r1.add();
        r1.sub();
        //interface calling static methods and only by itself it can call static method.
        //If there is any abstract methods then we have to must be to create a sub class that implementing the interface.
        a.show();

        a a1=new b();
        a1.a1();
        a1.a2();
        //it is not compulsory to defining the default method in sub class but abstract method 
        //must be otherwise the class be can't able to create its own object.
        //a1.a3();

        a b1=new c();
        b1.a1();
        b1.a2();
        b1.a3();
    }
    
}
