class Demo{
    static int m;
    static int n;

    int a;
    int b;
     
    {
        a=10;
        b=20;
    }

    static
    {
        m=2;
        n=3;
        System.out.println("Control in static bloack");
    }
    //static variable can't acees instance variable...
    static void Disp1(){
        System.out.println("The value of m is :"+m);
        System.out.println("The value of n is :"+n);
    }
    //non-static method can acess static members...
    void Disp2(){
        System.out.println("The value of a is :"+a);
        System.out.println("The value of b is :"+b);
    }

}
public class static1{
    public static void main(String[] args) {
        Demo d=new Demo();
        Demo.Disp1();
        d.Disp2();
        System.out.println("End Line");
    }
}