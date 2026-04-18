/*
Super Keyword--> 1.It refers to the current object inside a method or constructor.
2.When the local and instance variable name are same then JVM get confuse which one is local or instance
variable to avoid this problem we use this keyowrd for refering the variable.
3.It is also used when we want to call the default constructor if its own class.
Note-->
1.Whenever the supclass and super class variable and method name both are same the it can be used only.
2.To avoid the confusion between super class and sub class variables and methods that have same name
we should use super keyword.
3.It is used with -->Variable-->method-->constructor.
*/
class A{
    A(int a,int b)
    {
        
        System.out.println("Parametrized Constructor: "+a+b); 
    }
    A()
    {
        this(1,2);//we can call the paramterized constructor of own class using this keyowrd. 
        System.out.println("Default Constructor");
    }
    int a;//Instance
    A(int a)//Local
    {
        this();//Call the default constructor of its own class.
        this.a=a;
        System.out.println(a); 
    }
    void show()
    {
        System.out.println(this);
        /*This and when we print object show the same refrence. So, now its clear that it refers
            the current object of class.*/
    }
    
}
public class J60ThisKeyword {
    public static void main(String[] args)
    {
        A b1=new A(1);
        System.out.println(b1);
        b1.show();
    }
    
}
