import java.util.*;
public class treeSet {
    public static void main(String[] args) {
        TreeSet t1=new TreeSet();
        t1.add(100);
        t1.add(50);
        t1.add(150);
        t1.add(25);
        t1.add(75);
        t1.add(125);
        t1.add(175);
        System.out.println(t1);

        //t1.add(150);-->couldn't able to add duplicate value..

        System.out.println(t1.higher(50));//it return higher value form itself
        System.out.println(t1.lower(50));//it retuen lower value from itself

        System.out.println(t1.ceiling(40));//it return the element or if that elment not inside then return greater value
        System.out.println(t1.floor(40));//it return the element or if that element not inside then return lower value

        System.out.println(t1.ceiling(50));
        System.out.println(t1.floor(50));
    }
}
