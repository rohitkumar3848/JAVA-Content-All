import java.util.*;
public class linkedList {
    public static void main(String[] args) {
        LinkedList a1=new LinkedList();
        //Homogeneous Element and duplicate values----
        a1.add(100);
        a1.add(100);
        a1.add(100);
        a1.add(100);
        System.out.println(a1);
        System.out.println("********************");
        //Hetrogenous Element----
        LinkedList a2=new LinkedList();
        a2.add(100);
        a2.add("Rohit");
        a2.add('c');
        a2.add(1.75);
        a2.add(true);
        System.out.println(a2);
        System.out.println("********************");

        a2.add(3, 100);
        System.out.println(a2);

        a2.addFirst(101);
        System.out.println(a2);

        a2.addLast(109);
        System.out.println(a2);

        a2.removeFirst();
        System.out.println(a2);

        a2.removeLast();
        System.out.println(a2);

        a2.remove(3);
        System.out.println(a2);

        System.out.println(a2.indexOf(100));

        System.out.println(a2.peek());
        System.out.println(a2);

        System.out.println(a2.poll());
        System.out.println(a2);

        //for loop-->
        for(int i=0;i<a1.size();i++)
        {
            Object o=a1.get(i);
            System.out.println(o);
            //System.out.println(a1.get(i));
        }
        //for each loop-->
        for(Object o:a1)
        {
            System.out.println(o);
        }
        //Iterator-->
        Iterator itr=a1.iterator();
        while(itr.hasNext())
        {
            //Integer i=(Integer)itr.next();
            System.out.println(itr.next());
        }
        //ListIterator-->
        ListIterator litr=a1.listIterator(a1.size());
        while(litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }
    }
}
