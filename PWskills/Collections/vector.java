import java.util.*;
public class vector {
    public static void main(String[] args) {
        Vector v=new Vector(4);
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        System.out.println("Vector Size"+v.size());
        System.out.println("Vector Capacity"+v.capacity());
        Enumeration e=v.elements();
        while(e.hasMoreElements())
        {
            System.out.print(e.nextElement()+" ");
        }
        System.out.println("");
        Iterator itr=v.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        if(v.contains(2)){
            System.out.println(v.indexOf(2));
        }
        else{
            System.out.println("The element is not present");
        }
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());

    }
}
