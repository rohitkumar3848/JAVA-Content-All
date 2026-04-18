/*Problems With Multithreading-->Whenever the same resource is acessible by multiple thread at 
    the same time.
    Synchronization-->It is a techinique where we can control multiple threads or among no. of threads only one thread will
    enter inside the synchronized area.
    It's main purpose is to overcome the problem of multihreading when mutiple thread acess the resource at the same time
    on that situation it provides some wrong results...
    It classified in two ways--->
    1.Method level synchronized...(Every object have a lock in java and this lock can be given to only one thread at all
    the time..)
    2.Block level synchronized...  
 */
class thread2 implements Runnable
{
    int passenger,available=1;
    thread2(int passenger)
    {
        this.passenger=passenger;
    }
    public synchronized void run()
    {
        String name=Thread.currentThread().getName();
        if(available>=passenger)
        {
            System.out.println(name+"Seat Reserved...");
            available-=passenger;
        }
        //Here the problem occur bcz of multithreading the seat is provided for all these thread but the seat is only 1.
        //so here ambiguity occurs...
        //Thre problem is solved using synchronized keyword it ensures that at a time only one method enterv in the function..
        else{
            System.out.println("Sorry seat is not available...");
        }
    }
}
public class J100Synchronization {
    public static void main(String[] args) {
        thread2 r=new thread2(1);
        Thread  t1=new Thread (r);
        Thread  t2=new Thread (r);
        Thread  t3=new Thread (r);
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        t1.start();
        t2.start();
        t3.start();
}
}
