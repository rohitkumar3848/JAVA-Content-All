//The final class can't be extended or inherited to sub classes.
/*final--> shows error*/ class Test
{
    void Number()
    {
        System.out.println("1234567890");
    }
    //This can't be oveerride...
    final void AtmPin()
    {
        System.out.println("1200");
    }
}
class Thief extends Test
{
    @Override
    void Number()
    {
        System.out.println("9876543210");
    }
    /*
    Shows-->error
    @Override
    void AtmPin()
    {
        System.out.println("1100");
    }*/
}
 
public class J67Final {
    public static void main(String [] args)
    {
        //The value of final variable can't be overriden
        final int A=10;//the uppercase tells that it is final variable.
        System.out.println(A);
        //int A=2;We can't override once final variable assign the value.
        Thief a=new Thief();
        a.Number();
        a.AtmPin();
    }
}
