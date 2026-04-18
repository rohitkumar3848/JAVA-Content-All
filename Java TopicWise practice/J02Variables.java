public class J02Variables
{
    int a=10;//Instance Variable: Can be acessed by using objects. 
    static int b=20;//Static Variable: Single copy of that variable is created and shared among all objects at the class level
    public static void main(String [] args)
    {
      int c=30;//Local Variable: Can be acessed with in a block
      final int D=40;//Final Variable :The value can't be changed
      J02Variables t=new J02Variables();//Object Creation
      System.out.println(t.a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(D);

    }
}