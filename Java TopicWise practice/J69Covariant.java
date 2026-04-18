/*Co-variant-->Beofre this concept genrally we can't change the return type of overriden method but
new concept introduced in java called covariant where we can change the return typeof overriden method.
 */
class A{
    A show()
    {
        System.out.println("Base Class ---");
        return this;//this--> new A() return object as a refrence
    }
}
class B extends A
{
    /*@Override
    B show()
    {
        System.out.println("Derived Class ---");
        return new B();//this--> new A() return object as a refrence
    }*/
}
public class J69Covariant {
        public static void main(String [] args)
        {
            B b1=new B();
            b1.show();//call override method
        }
    
}
