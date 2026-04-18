/*new keyowrd-->It creates new objects and is used to allocate dynamic memory at runtime.
Usage-->
1.Call instance variable and non static methods.
2.call constructor
3.array declaration

*/public class J68new {
    int a;
    J68new()
    {
        System.out.println(a);
    }
    public static void main(String [] args)
    {
        J68new s=new J68new();
        System.out.println(s.a);
        //int ar[]=new int[5];
    }
}
