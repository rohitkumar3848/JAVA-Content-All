/*Interrupted Method-->It is used to interrupt the thread.
        If any thread is in sleeping or blocked state then we can easily interrupted the execution
        of thread by throwing InterruptedException.
        If thread not in sleeping or waiting state then thread execute noramally .
 */
class thread2 extends Thread
{
    public void run()
    {
        String name=Thread.currentThread().getName();
        try{
        for(int i=1;i<=3;i++)
        {
            System.out.println(name);
            Thread.sleep(1000);
        }
    }
    catch(InterruptedException e){
        System.out.println("Interrupted Exception...");
    }
    }
}
public class J97InterruptMethod {
    public static void main(String[] args) {
        thread2 t1=new thread2();
        t1.setName("Thread 1");
        t1.start();
        t1.interrupt();
    } 
}
