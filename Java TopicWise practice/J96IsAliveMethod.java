/*IsAlive Method-->It is used yo verify whelther the method is alive or not if alive then it returns
     true otherwise false.Before start method we call it then it returns false otherwise true.
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
public class  J96IsAliveMethod {   
    public static void main(String[] args) {
        thread2 t1=new thread2();
        thread2 t2=new thread2();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());

        System.out.println(t2.isAlive());
        t2.start();
        System.out.println(t2.isAlive());
    }   
}