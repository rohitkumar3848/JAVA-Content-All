/*Sleep Method--> It is a static method of thread class which throws checked exception i.e.
Interrupted Exception.
The main purpose of sleep method to put a thread into temporary writing state.
Syntax-->Thread.sleep(10000);
Or//
Thread t=new Thread();
t.sleep(10000);
 */
import java.lang.*;
class J91sleepmethod extends Thread{
    //@Override
    public void run()
    {
        String str=Thread.currentThread().getName();
        try{
            for(int i=1;i<=5;i++)
            {
                 System.out.println(str);
            }
        }
        catch(InterruptedException e)
        {

        }
    }
    public static void main(String [] args)
    {
        J91sleepmethod t1=new J91sleepmethod();
        J91sleepmethod t2=new J91sleepmethod();
        J91sleepmethod t3=new J91sleepmethod();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        
        t1.start();
        t2.start();
        t3.start();
    }
}
