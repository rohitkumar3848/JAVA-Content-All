abstract class Programming
{
    public abstract void Developer();
    public abstract void Rank();
}
class HTML extends Programming
{
    @Override
    public  void Developer() {
    System.out.println("Tim Berner Lee");        
    }
    //The all abstract method of abstract class is not defined in sub class then the sub class treated as a
    //abstract class then we can't create object if it's class.
    /*@Override
    public void Rank() {
    System.out.println("2nd");        
    }*/
}
class Java extends Programming
{
    @Override
    public  void Developer() {
    System.out.println("James Gosling");        
    }
    @Override
    public void Rank() {
    System.out.println("1st");        
    }
}
public class J64AbstractMethods {
    public static void main(String [] args)
    {
        Programming h1=new HTML();
        h1.Developer();
        h1.Rank(); 
        Programming j1=new Java();
        j1.Developer();
        j1.Rank();
    }
    
}
