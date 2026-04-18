/*Yield Method-->It allow us to run another Thread which has same priority by pause its current thread.
 */
class thread1 extends Thread
{
    public void run()
    {
        String name=Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(name);
            Thread.yield();
        }
    }
}
class thread2 extends Thread
{
    public void run()
    {
        String name=Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(name);
        }
    }
}
public class J94YieldMethod  {   
    public static void main(String[] args) {
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        t1.start();
        t2.start();
    }   
}