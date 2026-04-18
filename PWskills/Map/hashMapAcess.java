import java.security.KeyStore.Entry;
import java.util.*;
import java.util.Map.*;
public class hashMapAcess {
    public static void main(String[] args) {
        Map h1=new HashMap();
        h1.put(1, "Rohit");//entry
        h1.put(2, "Rahul");
        h1.put(3, "Sumit");
        h1.put(1, "Rohit");
        System.out.println(h1);
        //Acess particular key...
        System.out.println(h1.get(2));

        //Access Key-->
        Set keySet=h1.keySet();
        Iterator itr1=keySet.iterator();
        while(itr1.hasNext())
        {
            //System.out.println(itr1.next());
            Integer key=(Integer)itr1.next();
            System.out.println(key);
        }

        //Access Value-->
        Collection values=h1.values();
        Iterator itr2=values.iterator();
        while(itr2.hasNext())
        {
            //System.out.println(itr2.next());
            String val=(String)itr2.next();
            System.out.println(val);
        }

        //Access Key-Value Pair-->
        Set entrySet=h1.entrySet();
        Iterator itr3=entrySet.iterator();
        while(itr3.hasNext())
        {
            //System.out.println(itr3.next());
            //Object data=(Object)itr3.next();
            //System.out.println(data);
            Map.Entry data=(Entry)itr3.next();
            System.out.println(data.getKey()+" : "+data.getValue());
        }
    }
}
