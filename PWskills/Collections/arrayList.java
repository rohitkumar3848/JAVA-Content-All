import java.util.ArrayList;
public class arrayList{
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        //Homogeneous Element and duplicate values----
        a1.add(100);
        a1.add(100);
        a1.add(100);
        a1.add(100);
        System.out.println(a1);
        System.out.println("********************");
        //Hetrogenous Element----
        ArrayList a2=new ArrayList();
        a2.add(100);
        a2.add("Rohit");
        a2.add('c');
        a2.add(1.75);
        a2.add(true);
        System.out.println(a2);
        System.out.println("********************");
        //collections pass----
        ArrayList a3=new ArrayList();
        //List a3=new ArrayList();
        a3.add(a2);
        System.out.println(a3);
        System.out.println("********************");
        //index adding
        a2.add(2, "true");
        System.out.println(a2);
        System.out.println(a1.contains(100));
        System.out.println(a1.indexOf(100));
        System.out.println(a1.size());
        a1.ensureCapacity(10);
        a1.trimToSize();
        System.out.println(a1.size());


    }
}