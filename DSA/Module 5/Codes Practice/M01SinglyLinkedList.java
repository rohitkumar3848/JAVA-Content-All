
class Node{
    int val;
    Node next;
    Node(int x){
        val=x;
        next=null;
    }
}
public class M01SinglyLinkedList{
    public static Node insertAtBegin(Node head,int x){
        Node temp=new Node(x);
        if(head==null){
            head=temp;
            return head;
        }
        temp.next=head;
        head=temp;
        return head;
    }
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
    public static Node insertAtPos(Node head,int pos,int x){
        Node temp=new Node(x);
        if(head==null){
            head=temp;
            return head;
        }
        Node cur=head;
        for(int i=0;i<pos-1 && cur!=null;i++){
            cur=cur.next;
        }
        if(cur==null){
            return head;
        }
        else{
            temp.next=cur.next;
            cur.next=temp;
            return head;
        }
    }
    public static Node deletionAtBegin(Node head){
        if(head==null){
            return null;
        }
        else{
            return head.next;
        }
    }
    public static Node deletionAtAnyPos(Node head,int pos){
        if(pos==0){
            return head.next;
        }
        Node cur=head;
        for(int i=1;i<pos-1 && cur!=null;i++){
            cur=cur.next;
        }
        cur.next=cur.next.next;
        return head;
    }
    public static Node reverse(Node head){
        Node cur=head;
        Node next=null;
        Node prev=null;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head=prev;
        return head;
    }
    public static void  reverseRec(Node head,Node prev){
        Node curr=head;
        if(curr.next == null){
            head = curr;
            curr.next = prev;
            System.out.print("");
            traverse(head);
            return ;
        }

        Node nextPtr = curr.next;
        curr.next = prev;
        // recursion concept
        reverseRec(nextPtr, curr);
    }
    public static void MidEle(Node head){
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("\n"+slow.val);
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
        head=insertAtBegin(head, 1);
        head=insertAtEnd(head, 1);
        head=insertAtPos(head,2,19);
        traverse(head);
        System.out.println("");
        head=deletionAtBegin(head);
        traverse(head);
        head=deletionAtAnyPos(head, 5);
        System.out.println("");
        traverse(head);
        head=reverse(head);
        System.out.println("");
        traverse(head);
        System.out.println("");
        reverseRec(head,null);
        //traverse(head);
        MidEle(head);
    }
}