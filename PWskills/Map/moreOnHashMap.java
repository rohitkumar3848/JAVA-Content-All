import java.util.*;
import java.util.Map.*;

class Student{
    private String name;
    private int age;
    private String city;
    public Student(String name,int age,String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCity() {
        return city;
    }
    public String toString(){
        return name+" "+age+" "+city;
    }
}
public class moreOnHashMap {
    public static void main(String[] args) {
        Student s1=new Student("Rohit",19,"Aligarh");
        Student s2=new Student("Rohan",21,"Babrala");
        Student s3=new Student("Rahul",22,"Rohan");

        Map m1=new HashMap();

        m1.put(1, s1);
        m1.put(2, s2);
        m1.put(3, s3);

        System.out.println(m1);

        Set entrySet=m1.entrySet();
        Iterator itr=entrySet.iterator();
        while(itr.hasNext())
        {
            //System.out.println(itr.next());
            //Object data=(Object)itr.next();
            //System.out.println(data);
            Map.Entry data=(Entry)itr.next();
            System.out.println(data.getKey()+" "+data.getValue());
        }

    }
}
