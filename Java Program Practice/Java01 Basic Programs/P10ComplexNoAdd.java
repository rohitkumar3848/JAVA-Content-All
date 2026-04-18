public class P10ComplexNoAdd {

    int real,img;
    public P10ComplexNoAdd(int r,int i)
    {
        real=r;
        img=i;
    }
    public void show()
    {
        System.out.println(real+"+i"+img);
    }
    public static P10ComplexNoAdd add(P10ComplexNoAdd c1,P10ComplexNoAdd c2)
    {
        P10ComplexNoAdd c3=new P10ComplexNoAdd(0, 0);
        c3.real=c1.real+c2.real;
        c3.img=c1.img+c2.img;
        return c3;
    }
    public static void main(String [] args)
    {
        P10ComplexNoAdd p1=new P10ComplexNoAdd(3, 4);
        P10ComplexNoAdd p2=new P10ComplexNoAdd(1, 2);
        p1.show();
        p2.show();
        P10ComplexNoAdd p3=add(p1, p2);
        p3.show();
    }    
}
