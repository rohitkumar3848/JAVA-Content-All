import java.util.*;
import java.util.map.*;
public class hashTableAndTreetable {
   public static void main(String[] args) {
    Hashtable ht=new Hashtable();
    //null can take as key value pair and insertion doesn't preserved...
    ht.put(1,"Rohit");
    ht.put(2,"Kumar");
    ht.put(3,"Luv");
    System.out.println(ht); 

    TreeMap tm=new TreeMap();
    //Insertion is in sorting order...
    tm.put(1,"Rohit");
    tm.put(2,"Kumar");
    tm.put(3,"Luv");
    System.out.println(tm);
   }
}
