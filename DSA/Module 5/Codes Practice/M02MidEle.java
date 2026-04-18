class Node{
    int val;
    Node next;
    Node(int x){
        val=x;
        next=null;
    }
}
public class M02MidEle {
    public static Node insertAtEnd(Node head,int x){
        Node temp=new Node(x);
        if(head==null){
            head=temp;
            return head;
        }
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=temp;
        temp.next=null;
        return head;
    }
    public static void MidEle(Node head){
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("\n"+slow.val);
    }
    public static boolean isLoop(Node head){
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        //System.out.println("\n"+slow.val);
        return false; 
    }
    public static void traverse(Node head){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        //temp2.next=head;
        // head=insertAtEnd(head, 1);
        // head=insertAtEnd(head, 2);
        // head=insertAtEnd(head, 3);
        //head=insertAtEnd(head, 4);
        //traverse(head);
        //MidEle(head);
        if(isLoop(head)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
