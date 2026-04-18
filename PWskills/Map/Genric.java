import java.util.*;
public class Genric {
    public static void main(String[] args) {
        ArrayList<String> hm=new ArrayList<String>();
        hm.add("Rohit");
        hm.add("Mohit");
        //hm.add(1);//It shows Error at compile timewhen we add any different type of value which is not specified at declares time of arraylist...
        String n1=(String)hm.get(0);
        String n2=(String)hm.get(1);
        System.out.println(n1);
        System.out.println(n2);
    }
}
