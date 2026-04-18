/*Abstract Class--->1.A class which contain abstract in its declarations.
2.We can't create object for it.
3.We can create of reference of abstract class using derived class.
4.It may or may not contain abstract methods.
5.It can have non abstract methods(static final etc..).
6.To use abstract class we have to inherit it with sub class.
7.If a class contain partial implementation then we should declare a class as abstract.
Example If there is any abstract method inside it then the class should be abstract.


Abstract Methods-->The method have acess modifier abstract called as abstract method.
-->It can used in abstract class only.
-->It doesn't contain any body of the method.
-->Abstract method must be overriden in sub clases otherwise it will also a became abstract class.
-->Whenever the action is common but implementation is different the we should use abstract mehod.
 */
abstract class animal{
    public abstract void sound();
    animal()//Non abstract method
    {
        System.out.println("The Animal ....");
    }
}
class Dog extends animal{
    //If we are not creating the constructor of dog class method then the base class constructor
    //automatic invoked.
    Dog()
    {
        super();//Calling its base class constructor it is not mandatory to declare the the calling of
        //default constructor we can used it parametrized constructor.
        System.out.println("The Dogs ....");
    }
    public void sound(){
        System.out.println("The dog is barking...");
    }
}
class lion extends animal{
    lion()
    {
        super();//Calling its base class constructor
        System.out.println("The Lions ....");
    }
    public void sound(){
        System.out.println("The lion is roar...");
    }
}
public class J63AbstractClass {
    public static void main(String [] args) {
        animal a1=new Dog();//Creating reference of abstract class the base have capabilty to hold the object of its sub class.
        a1.sound();
        animal r1=new lion();
        r1.sound();        
    }
    
}
