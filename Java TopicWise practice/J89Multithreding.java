/*Multithreading --->It is a process to execute multiple threads at the same time without 
dependency of other threads.
    Thread-->It is a pre-defined class which is available in java.lang package.
        Thread is a basic unit of CPU and it is well known for independent executions.

    To create thread two ways-->
    !-->By extending Thread class.
    !-->By implementing Runnable interface(Best approach of multithreading)
*/
//using thread class 
/*class J89Multithreding extends Thread{  
    @Override
    public void run()
    //It is a method which invoke by started the start method..
    {
        try{
            for(int i=1;i<=5;i++)
            {
                System.out.println("Rohit");
                Thread.sleep(10000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }  
    public static void main(String args[])throws InterruptedException{ 
    //main thread-->It is execute when main method is started.
    //The work of main thread is Creating object of other threads and stared them.. 
    J89Multithreding t1=new J89Multithreding();  
    t1.start();  
    for(int i=1;i<=5;i++)
    {
        //The exception is handled by JVM
        System.out.println("Rohit");
        Thread.sleep(10000);
    }
    }  
}  
*/
//Using Runnable Interface-->
/* 
class J89Multithreding implements Runnable{  
    @Override
    public void run()
    //It is a method which invoke by started the start method..
    {
        try{
            for(int i=1;i<=5;i++)
            {
                System.out.println("Child Thread..");
                Thread.sleep(10000);
            }
        }
        catch(InterruptedException e)
        {
           System.out.println(e);
        }
    }  
    public static void main(String args[])throws InterruptedException
    { 
    //main thread-->It is execute when main method is started.
    //The work of main thread is Creating object of other threads and stared them.. 
    J89Multithreding t1=new J89Multithreding(); 
    Thread t=new Thread(t1); 
    t.start();  
    for(int i=1;i<=5;i++)
    {
        //The exception is handled by JVM
        System.out.println("Rohit");
        Thread.sleep(10000);
    }
    }  
} */
//Using Thread class--(Thread(String name))
/*public class J89Multithreding{
    //main method
     public static void main(String [] args)
     {
        
       // creating an object of the Thread class using the constructor Thread(String name) 
        Thread t=new Thread("My first Thread");
        // the start() method moves the thread to the active state
        t.start();
        // getting the thread name by invoking the getName() method
        String str=t.getName();
        System.out.println(str);
     }
}
*/
//Using Thread(Runnable,String)
class J89Multithreding implements Runnable{    
    public void run()
    {
        System.out.println("Runnable thread is running....");
    } 
    public static void main(String args[])throws InterruptedException
    {  
    J89Multithreding t1=new J89Multithreding(); 
    Thread t=new Thread(t1,"Rohit Kumar"); 
    t.start();
    String str=t.getName();
    System.out.println(str);
    }  
}