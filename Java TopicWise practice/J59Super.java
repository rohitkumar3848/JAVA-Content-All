/*
Super Keyword--> It refers to the object of super class, it is used when we want to call the super
class variable,method & constructor through sub class object.
Note-->
1.Whenever the supclass and super class variable and method name both are same the it can be used only.
2.To avoid the confusion between super class and sub class variables and methods that have same name
we should use super keyword.
3.It is used with -->Variable-->method-->constructor.
*/
class A{
    int a=10;
    A()
    {
        System.out.println("base class Constructor");
    }
    void show()
    {
        System.out.println("Hello Super class");
    }
}
class B extends A{
    int a=11;
    //super;Here the super keyword automatically declared the deafult constructor but in case of 
    //Parametrized constructor we should called like that super(1); for single parameter.
    //Here the execution of constructor up to down or base constructor to derived.
    B()
    {
        System.out.println("sub class Constructor");
    }
    void show()
    {
        super.show();//Using super keyword the its base class method is acess.
        System.out.println("Hello Sub class");
        System.out.println(a);
        System.out.println(super.a);//Using super keyword the super class variable can be acess.
    }
}
public class J59Super {
    public static void main(String[] args)
    {
        B b1=new B();
        b1.show();
    }
    
}
