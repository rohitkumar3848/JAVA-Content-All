import java.util.*;
class Gen<T>
{
    T obj;
    public Gen(T obj)
    {
        this.obj=obj;
    }
    void Display(){
        System.out.println(obj.getClass().getName());
    }
    public T getObj(){
        return obj;
    }
}
public class Genric3 {
    public static void main(String[] args) {
        Gen<Integer> g1=new Gen<Integer>(1);
        g1.Display();
        System.out.println(g1.getObj());
        Gen<String> g2=new Gen<String>("Rohit");
        g2.Display();
        System.out.println(g2.getObj());
    }
}
