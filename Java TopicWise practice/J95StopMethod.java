/*Stop Method-->It used to terminate the thread permanently.
 */
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
public class  J95StopMethod {   
    public static void main(String[] args) {
        thread1 t1=new thread1();
        thread1 t2=new thread1();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t2.start();
        t2.stop();
    }   
}
