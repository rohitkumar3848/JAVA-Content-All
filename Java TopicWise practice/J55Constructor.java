/*Constructor-->It is a special method which has same name as class name and invoked automatically when
the object of class is invoked.
Every java class has a constructor.
It's main purpose of constructor is intialise the object.
It doesn't contain return type include void.
Its types-->
1.Default constructor-->which doesn't have any parameter.(If doesn't make any default constructor then
java compiler automatically invoked by defaultly default constructor).
2.Parametrized constructor-->A constructor through which we can pass one or more parameter.
3.Copy Constructor-->Whenever we pass object reference to constructor.(Copy data of another constructor
by passing copy as a reference in the parameter of constructor).
4.Private Constructor-->It is possible in java to write a constructor as aprivate but accrording to the
rule we can't acees private members outside the class.
 */
class demo
{
    int i;
    String st;
    //Default Constructor-->
    demo()
    {
        i=1;
        st="Rohit";
    }
    //Parametrized Constructor-->
    demo(int x,String str)
    {
        i=x;
        st=str;
    }
    //Copy Constructor-->
    demo(demo d1)
    {
        i=d1.i;
        st=d1.st;
    }
    /*private demo()
    {
        i=11;
        st="Rahul";
    }-->This constructor is only invoked when the object of class created with in that class where
    the constructor is declared.
    One thing to remember we can create ony one thing either deafult constructor or private bcz 
    compiler get confuse when both constructor are declared or defined.
    */
    void Display()
    {
        System.out.println(i+" "+st);
    }

}
public class J55Constructor {
    public static void main(String[] args) {
        //Constructor 
        demo d=new demo();//Default Constructor invoked
        d.Display();
        demo d1=new demo(3,"Rohit");//Parametrized Constructor invoked
        d1.Display();
        demo d2=new demo(d1);//Copy Constructor invoked
        d2.Display();
    }
    
}
