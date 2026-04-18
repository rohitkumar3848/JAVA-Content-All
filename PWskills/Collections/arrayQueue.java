import java.util.*;
public class arrayQueue {
    public static void main(String[] args) {
        ArrayDeque a1=new ArrayDeque();

        a1.add(100);
        a1.addFirst(200);
        a1.addLast(300);
        System.out.println(a1);

        ArrayDeque a2=new ArrayDeque();

        a2.addAll(a1);
        System.out.println(a2);

        a1.removeFirst();
        System.out.println(a1);

        a1.removeLast();
        System.out.println(a1);

        a1.offer(100);
        a1.offerFirst(200);
        a1.offerLast(300);
        System.out.println(a1);
    }
}
