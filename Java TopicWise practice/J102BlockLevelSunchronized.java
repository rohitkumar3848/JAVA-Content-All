/*BlockLevelSynchronized-->The whole method couldn't synchronized the only part get synchronized
we have to enclosed those few lines of the code put inside synchronized block.
 */
class msg
{
    public void show(String name)
    {
        //100lines of code..
        synchronized(this)
        {
            for(int i=1;i<=3;i++)
            {
                System.out.println("Good Evening"+name);
            }
        }
        //100lines of code..
    }
}
class thread1 extends Thread
{
    msg m;
    String name;
    thread1(msg m,String name)
    {
        this.m=m;
        this.name=name;
    }
    public void run()
    {
        m.show(name);
    }
}

class thread2 extends Thread
{
    msg m;
    String name;
    thread2(msg m,String name)
    {
        this.m=m;
        this.name=name;
    }
    public void run()
    {
        m.show(name);
    }
}
public class J102BlockLevelSunchronized {
    public static void main(String[] args) {
        msg m=new msg();
        thread1 t1=new thread1(m, "Rohit");
        thread2 t2=new thread2(m, "Rahul");
        t1.start();
        t2.start();
    }    
}
