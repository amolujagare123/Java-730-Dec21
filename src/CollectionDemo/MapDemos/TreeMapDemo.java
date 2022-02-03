package CollectionDemo.MapDemos;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer,String> tm = new TreeMap<>();

        tm.put(103,"amol");
        tm.put(303,"rupa");
        tm.put(253,"sonali");
        tm.put(555,"priyanka");
        tm.put(111,"pravin");
        tm.put(321,"ashok");

        System.out.println("hm="+tm);

    }
}
