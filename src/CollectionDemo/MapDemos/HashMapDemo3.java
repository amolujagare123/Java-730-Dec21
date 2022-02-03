package CollectionDemo.MapDemos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo3 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(103,"amol");
        hm.put(303,"rupa");
        hm.put(253,"sonali");
        hm.put(555,"priyanka");
        hm.put(111,"pravin");
        hm.put(321,"ashok");

        System.out.println("hm="+hm);

        Set s = hm.keySet();
        System.out.println(s);

        Collection values = hm.values();
        System.out.println(values);

        Set entrySet = hm.entrySet();
        System.out.println(entrySet);
    }
}
