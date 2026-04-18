/*Inheritence-->It is a process by whicch the derived class can acess the properties of 
base class by using extends Keyword.
It provides code reusability.
We can't acess private member of class through inheritence.
Method Overriding only possible through inheritence.
Types Of Inheritence--->
1.Simple Inheritence-->In this one super class and one sub class.
1.Mullevel Inheritence-->In this one super class and multiple sub class.
1.Hieirarchical Inheritence-->In this one super class and multiple sub class and all sub class
directly extends super class called Heirarchical Inheritence.
Multiple Inheritence-->When a sub class wants to extends two or more super clases that have same 
method the java Compiler get confuse which method should invoke.
Then their might be a chance of memory duplication that's the reason the java doesn't support 
the multiple inheritence.
 */
class Student
{
    protected int roll,marks;
    String name;
    protected void input()
    {
        System.out.println("Enter Students Details:  ");
    }
}
//Single Inheritence-->
//As well as Hieirarchical Inheritence also bcz extends from base class
class Rohit extends Student
{
    void Display()
    {
        roll=1;
        marks=78;
        name="Rohit Kumar";
        System.out.println(roll+" "+name+" "+" "+marks);
    }
}
//Multilevel Inheritence-->
class PersonalDetails extends Rohit
{
    void Show()
    {
        System.out.println("I am Residing in Aligarh");
    }
}
//Hieirarchical Inheritence-->bcz it is extends base class and when two or more derived class 
//extends the same base class then Hieirarchical Inheritence occurs.
class Result extends Student
{
    void res()
    {
        System.out.println("Pass");
    }
}
public class J58Inheritence {
    public static void main(String [] args)
    {
        //Single Inheritence
        Rohit r1=new Rohit();
        r1.input();
        r1.Display();
        //2.Multilevel Inheritence
        PersonalDetails p1=new PersonalDetails();
        p1.input();
        p1.Display();
        p1.Show();
        //3.Hieirarchical Inheritence
        Result r2=new Result();
        r2.input();
        r2.res();
    }
}
