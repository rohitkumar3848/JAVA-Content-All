/*Instance Block-->It is similiar to method which has no name it can be writtten inside
a class only but not inside a method.
1.It is always called before the constructor.
2.We can use only a instance variable inside it.
3.We write time consuming block like JDBC Connectivity.
 */
class A{
    int a,b;
    A()
    {
        a=30;
        b=40;
        System.out.println(a+" "+b);
    }
    //Instance Block here and it execute before the constructor.
    {
        a=20;
        b=30;
        System.out.println(a+" "+b);
    }
}
public class J56Instance {
    public static void main(String[] args)
    {
        A a1=new A();
    }
    
}
