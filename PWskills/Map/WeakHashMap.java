import java.util.*;
import java.util.Map.*;
import java.lang.*;
class employee{
    private String name;
    private int eid;
    public employee(String name,int eid){
        this.name=name;
        this.eid=eid;
    }
    public String toString(){
        return name+" "+eid;
    }
    @Override
    public void finalize(){
        System.out.println("Clean up code by garbage collector memory from heap");
    }
}
public class WeakHashMap {
    public static void main(String[] args) {
        employee s1=new employee("Rohit", 1);
        HashMap hm=new HashMap();//It dominating garbage collector...
        //WeakHashMap hm=new WeakHashMap();//Doesn't domianting garbage
        hm.put(s1, "Rohit");
        System.out.println(hm);
        s1=null;
        System.gc();

        System.out.println(hm);
        System.out.println("End Part");

    }
}
