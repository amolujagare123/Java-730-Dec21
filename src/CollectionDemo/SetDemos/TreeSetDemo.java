package CollectionDemo.SetDemos;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("amol");
        ts.add("achyut");
        ts.add("ashok");
        ts.add("chetan");
        ts.add("girija");

        System.out.println(ts.add("girija"));

        System.out.println(ts);
    }
}
