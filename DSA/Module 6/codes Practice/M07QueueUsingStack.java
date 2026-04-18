import java.util.Stack;

public class M07QueueUsingStack {
    static Stack<Integer> s1=new Stack<>();
    static Stack<Integer> s2=new Stack<>();
    //Push()-->0(1)
    static void enqueue(int x){
        s1.push(x);
        System.out.println("The inserted element is :"+x);
    }
    //Pop()-->0(n)
    static void dequeue(){
        if(s1.empty() && s2.empty()){
            System.out.println("Deleteion not possible");
            System.exit(0);
        }
        if(s2.empty()){
            while(!s1.empty()){
                int ele=s1.pop();
                s2.push(ele);
            }
        }
        int delel=s2.pop();
        System.out.println("The deleted element is :"+delel);
    }
    public static void main(String[] args) {
        M07QueueUsingStack q1=new M07QueueUsingStack();
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);
        
        q1.dequeue();
        q1.enqueue(6);
        q1.dequeue();
        
    }
}
