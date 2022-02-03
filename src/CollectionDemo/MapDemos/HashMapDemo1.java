package CollectionDemo.MapDemos;

import java.util.HashMap;

public class HashMapDemo1 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(103,"amol");
        hm.put(303,"rupa");
        hm.put(253,"sonali");
        hm.put(555,"priyanka");
        hm.put(111,"pravin");
        hm.put(321,"ashok");

        System.out.println("hm="+hm);

        HashMap<Integer,String> hm1 = new HashMap<>();

        System.out.println("hm1="+hm1);
        hm1.putAll(hm);
        System.out.println("hm1="+hm1);

    }
}
