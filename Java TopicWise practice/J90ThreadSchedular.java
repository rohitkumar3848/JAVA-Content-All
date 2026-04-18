/*Thread Schedular-->It is the part of processor which executes multiple threads on a sinle processor.
 */
public class J90ThreadSchedular extends Thread{
    public void run()
    {
        String str=Thread.currentThread().getName();
        for(int i=1;i<=5;i++)
        {
            System.out.println(str);
        }
    }
    public static void main(String [] args)
    {
        J90ThreadSchedular t1=new J90ThreadSchedular();
        J90ThreadSchedular t2=new J90ThreadSchedular();
        J90ThreadSchedular t3=new J90ThreadSchedular();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        
        t1.start();
        t2.start();
        t3.start();

        String str=Thread.currentThread().getName();
        for(int i=1;i<=5;i++)
        {
            System.out.println(str);
        }
    }
    
}
