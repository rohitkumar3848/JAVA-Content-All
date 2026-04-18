import java.util.*;

public class hashMap{
    public static void main(String[] args) {
        HashMap h1=new HashMap();
        //h1.put(null,null);
        h1.put(1, "Rohit");//entry
        h1.put(2, "Rahul");
        h1.put(3, "Sumit");
        h1.put(1, "Rohit");//skip this count earlier
        h1.put("Rohit","Rohit");
        
        System.out.println(h1);

        LinkedHashMap lhm=new LinkedHashMap();
        //It maintains the insertion order...
        lhm.put(1, 2);
        lhm.put(2, "Rohit");

        System.out.println(lhm);
    }
}