/*Join Method-->The main purpose of join method is to put the thread into temporary waiting state
if we want to execute complete any particular thread among all the threads available in the thread pool.
Join method also throw a checked exception i.e-> InterruptedException.
 */
public class J92JoinMethod extends Thread {
    public void run()
    {
        String name=Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        J92JoinMethod t1=new J92JoinMethod();
        J92JoinMethod t2=new J92JoinMethod();
        J92JoinMethod t3=new J92JoinMethod();
        t1.setName("1st Thread");
        t2.setName("2nd Thread");
        t3.setName("3rd Thread");
        t2.start();;
        //Now t2 thread is execute first and all thread waiting till the time of t2 thread execution. 
        try{
            t2.join();;
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        t1.start();
        t3.start();
    }   
}
