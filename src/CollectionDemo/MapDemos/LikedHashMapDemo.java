package CollectionDemo.MapDemos;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class LikedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();

        lhm.put(103,"amol");
        lhm.put(303,"rupa");
        lhm.put(253,"sonali");
        lhm.put(555,"priyanka");
        lhm.put(111,"pravin");
        lhm.put(321,"ashok");

        System.out.println("hm="+lhm);

    }
}
