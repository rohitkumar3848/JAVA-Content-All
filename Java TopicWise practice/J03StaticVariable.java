public class J03StaticVariable {
    static int a=10;
    void fun()
    {
        int b=10;
        System.out.println(a+" "+b);
        a++;//The Static Variable creates single copy so value changed when the fun function call again and again
        b++;
    }
    public static void main(String[] args) 
    {
        J03StaticVariable A=new J03StaticVariable();
        A.fun();
        A.fun();
    }
    
}
