public class J09IncDcr {
    public static void main(String []args)
    {
        int a=10;
        //PrePost Increament
        System.out.println(a);//10
        System.out.println(a++);//10 first print then increase
        System.out.println(a);//11
        System.out.println(++a);//12 first increase then print
        //PrePost Decreament
        System.out.println(a);//12
        System.out.println(a--);//12 first print then decrease
        System.out.println(a);//11
        System.out.println(--a);//10 first decrease then print
    }
    
}
