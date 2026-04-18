import java.util.*;
public class Collection1{
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add(2);
        a1.add(3);
        a1.add(1);
        a1.add(0);
        System.out.println(a1);
        Collections.sort(a1);
        System.out.println(a1);

        ArrayList a2=new ArrayList();
        a2.add("Rohit");
        a2.add("Rahul");
        a2.add("Deepak");
        System.out.println(a2);
        Collections.sort(a2);
        System.out.println(a2);
        int index=Collections.binarySearch(a2, 3);
        System.out.println("Index is:"+index);
        Collections.rotate(a1, 3);
        System.out.println(a1);

        Collections.shuffle(a1);
        System.out.println(a1);

        Collections.frequency(a1, 2);
        System.out.println(a1);
        
    }
}
