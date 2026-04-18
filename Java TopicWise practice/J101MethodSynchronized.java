class Table {
    public synchronized void printable(int table)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(table*i);
        }
    }
}
+class thread1 extends Thread
{
    Table t;
    thread1(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printable(5);
    }
}
class thread2 extends Thread
{
    Table t;
    thread2(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printable(7);
    }
}
public class J101MethodSynchronized {
    public static void main(String[] args) {
        Table r=new Table();
        thread1 t1=new thread1(r);
        thread2 t2=new thread2(r);
        t1.start();
        t2.start();
    }
}
