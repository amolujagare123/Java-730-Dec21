package CollectionDemo.SetDemos;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("amol");
        lhs.add("achyut");
        lhs.add("ashok");
        lhs.add("chetan");
        lhs.add("girija");

        System.out.println(lhs.add("girija"));

        System.out.println(lhs);
    }
}
