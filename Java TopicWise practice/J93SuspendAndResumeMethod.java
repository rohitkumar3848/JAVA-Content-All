/*Suspend Method-->It is to put the thread form running state to waiting state.
  Resume Method-->It is used to resume a suspended thread from waiting state to runnable state.
 */
public class J93SuspendAndResumeMethod extends Thread {
    public void run()
    {
        String name=Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        J93SuspendAndResumeMethod t1=new J93SuspendAndResumeMethod();
        J93SuspendAndResumeMethod t2=new J93SuspendAndResumeMethod();
        J93SuspendAndResumeMethod t3=new J93SuspendAndResumeMethod();
        t1.setName("1st Thread");
        t2.setName("2nd Thread");
        t3.setName("3rd Thread");
        t1.start();
        t2.start();
        t2.suspend();
        t3.start();
        t2.resume();
    }   
}