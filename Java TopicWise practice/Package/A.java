package mypack;
//Private method can be acessible with in class of package only can;t be acessible in other
/*public class A {
    private void show()
    {
        System.out.println("My package");
    }
    public static void main(String[] args) {
        A r=new A();
        r.show();
    }
}*/
//Default method can be acessible with in class of package as well as can be acessible in other clases.
/*class A {
    default void show()
    {
        System.out.println("My package");
    }
}
class B{
    public static void main(String[] args) {
        A r=new A();
        r.show();
    }
}*/
//Protected member of can be acessible with other class of same package.
public class A {
    public void show()
    {
        System.out.println("My package");
    }
}
/* 
class B extends A
{
    public static void main(String[] args) {
        B r=new B();
        r.show();
    }
}*/
