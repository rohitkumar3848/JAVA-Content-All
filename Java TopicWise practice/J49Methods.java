/*Static method--> It can be invoked by using class name and it can able to acess the static
 variable inside it only.
 Non-Static method--> It can be invoked by using object of class name and it can able to acess the instance 
 variable or static variable both inside it.
 */
public class J49Methods{
    int a=10;
    static int b=20;
    //This is static method it can be call by using class name.
    public static void Show()
    {
        System.out.println("Show--> "+b);
    } 
    //This is Non Static variable it can invoked by using create object of class.
    void Display(){
        System.out.println("Display--> "+(a+b));
    }
    public static void main(String[] args) {
        J49Methods a1=new J49Methods();
        a1.Display();
        J49Methods.Show();
    }
}