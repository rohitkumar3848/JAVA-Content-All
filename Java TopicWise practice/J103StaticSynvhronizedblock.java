/*Synchronized with more than one objects-->As we know every object has one lock in java
    and this lock can be given to one thread but if we have multiple objects then we can also
    have multiple locks and this lock can be given multiple threads so,again we will got currupted 
    data even in the synchronized area.
 */
class Bank extends Thread{
    static int bal=5000;
    static int withdraw;
    Bank(int withdraw)
    {
        this.withdraw=withdraw;
    }
    public static synchronized void run()
    {
        String name=Thread.currentThread().getName();
        if(withdraw<=bal)
        {
            System.out.println(name+"Wihdraw money..");
            bal=bal-withdraw;
        }
        else
        {
            System.out.println("Insuuficient Balance");
        }
    }
}
public class J103StaticSynvhronizedblock {
    public static void main(String[] args) {
        Bank b=new Bank(5000);
        Thread t1=new Thread(b);
        Thread t2=new Thread(b);
        t1.setName("Rohit");
        t2.setName("Rahul");

        Bank b1=new Bank(5000);
        Thread t3=new Thread(b1);
        Thread t4=new Thread(b1);
        t3.setName("Ayush");
        t4.setName("Abhishek");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
    
}
