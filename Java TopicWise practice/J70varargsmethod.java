/*Var-args method-->It defined as number of arguement methods and it is new introduced in JDk 1.5v.
By using this concept we can pass any no. of paramter including zero paramter to calling method.
 */
class A{
    void add(int ... a)//take one D array
    {
        int sum=0;
        for(int x:a)
        {
            sum+=x;
        }
        System.out.println("Sum--> "+sum);       
    }
}
public class J70varargsmethod {
    public static void main(String [] args)
    {
        A a1=new A();
        a1.add(1);
        a1.add(2,3);
        a1.add(4,5);
    }
}
