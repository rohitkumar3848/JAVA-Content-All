/*Polymorphis--->Same object have different behaviour.
Example:PErson can be teacher,husband student,father stc...
Types:
1.Compile Time(Static Or early Binding) polymorphism:It exits at compile time.
    --->Method Overloading:Whenever a class contain more than method of same name and different in paramter
        called method overloading.
2.Run Time polymorphism-->Exits at Runtime or at execution of program.
    --->Method overriding:Whenever we write method in super and sub classes in such way the method
        name and parameter must be same then its called method overriding.
        Rule-->
        1.Method is present in base class as same method declare as overriden method in sub class.
        2.If no then compilation error if yes then check overriden method or not if yes then call sub class
            method otherwise super class method.
        */
public class J61Polymorphism {
    int a = 10;

    void show() {
        System.out.println("First call A:" + a);
    }

    void show(int a) {
        System.out.println("Second call A:" + a);
    }

    void show(int a, int b) {
        System.out.println("Second call A:" + a + " B:" + b);
    }

    public static void main(String[] args) {
        J61Polymorphism j1 = new J61Polymorphism();
        j1.show();
        j1.show(1);
        j1.show(1, 2);
    }
}
