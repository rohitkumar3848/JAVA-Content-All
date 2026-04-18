import java.util.*;
class Student{
    private String name;
    private int age;
}
class Employee{
    private String name;
    private int eid;
}
public class Genric2 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Employee e1=new Employee();
        ArrayList<Student> a1=new ArrayList<Student>();
        a1.add(s1);
        a1.add(s2);
        //a1.add(e1);//It doesn't allow here bcz the type is already declared Student so we can't assign the employee type object.

    }
}
