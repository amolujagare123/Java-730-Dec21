package CollectionDemo.MapDemos;

import java.util.HashMap;

public class HashMapDemo2 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();
        System.out.println(hm.isEmpty()); // true

        hm.put(103,"amol");
        hm.put(303,"rupa");
        hm.put(253,"sonali");
        hm.put(555,"priyanka");
        hm.put(111,"pravin");
        hm.put(321,"ashok");

        System.out.println("Size="+hm.size()); //6
        System.out.println(hm.isEmpty()); // false

        System.out.println("hm="+hm);

       // System.out.println(hm.get(551));

        hm.remove(111);

        System.out.println("hm="+hm);

        System.out.println( hm.containsKey(321));
        System.out.println( hm.containsValue("priyanka1"));

        System.out.println("Size="+hm.size()); //5

        hm.clear();
        System.out.println("hm="+hm);
    }
}
