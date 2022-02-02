package CollectionDemo.SetDemos;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("amol");
        hs.add("achyut");
        hs.add("ashok");
        hs.add("chetan");
        hs.add("girija");
        System.out.println(hs.add("girija"));

        System.out.println(hs);
    }
}
