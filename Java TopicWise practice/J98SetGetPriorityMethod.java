import javax.management.monitor.StringMonitorMBean;

/*thread Priority-->In java it is possible to assign the priority of thread.
    To set these priority java thread class has two methods-->
    setPriority();
    getPriority();
    The thread class also provide three pre-defined final variable and its value lie between\
    1 to 10.
    Thread.MIN_RIORITY--->1
    Thread.NORM_RIORITY--->5
    Thread.MAX_RIORITY--->10
 */
class thread2 extends Thread
{
    public void run()
    {
        for(int i=1;i<=3;i++)
        {
            System.out.println(Thread.currentThread().getPriority());
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class J98SetGetPriorityMethod {
    public static void main(String[] args) {
        thread2 t1=new thread2();
        thread2 t2=new thread2();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.setPriority(3);
        t1.setPriority(7);
        t1.start();
        t2.start();
    }
}
