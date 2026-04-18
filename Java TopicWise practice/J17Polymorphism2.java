class Shape
{
    void show()
    {
        System.out.println("Shape can't determine");
    }
}
class square extends Shape{
    //@Override//If it is commented no error it is for that it is overriden method.
    //If the same base class method is not present in base class and this method declared as overriden method then it show error.
    void show()
    {
        //super.show();//We can invoke the base class method using super keyword.
        System.out.println("Shape is Square");
    }
}
public class J17Polymorphism2 {
    public static void main(String[] args){
    Shape sc=new square();
    sc.show();  
    }
}
