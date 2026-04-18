
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class M08StackUsingQueue {
    static Queue<Integer> q1=new LinkedList<>();
    static Queue<Integer> q2=new LinkedList<>();
    //Push()-->0(1)
    static void insert(int x){
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.poll();
        }
        q1.add(x);
        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll();
        }
        System.out.println("The inserted element is :"+x);
    }
    //Pop()-->0(n)
    static void delete(){
        if(q1.isEmpty()){
            System.out.println("Deletion is not possible");
            System.exit(0);
        }
        int ele=q1.poll();
        System.out.println("The deleted element is :"+ele);
    }
    public static void main(String[] args) {
        M07QueueUsingStack q1=new M07QueueUsingStack();
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
        
        delete();
        insert(6);
        delete();
        
    }
}
