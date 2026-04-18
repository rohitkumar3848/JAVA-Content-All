/*Encapsulation--> The wrappinhg of data into single unit(data values and methods) called Encapsulation.
1.Declared the class variable as a private.
2.Declare the class methods as a public.
Example :Class
 */
public class J62Encapsulation {
    private int val;//Private Variable data hiding 
    public void setValue(int x)//data abstraction
    {
        val=x;
    }
    public int getValue()
    {
        return val;
    }
    public static void main(String [] args)
    {
        J62Encapsulation r1=new J62Encapsulation();
        r1.setValue(1);
        System.out.println(r1.getValue());
    }
}
