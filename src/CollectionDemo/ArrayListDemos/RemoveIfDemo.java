package CollectionDemo.ArrayListDemos;

import java.util.ArrayList;

public class RemoveIfDemo {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("achyut");
        al.add("ashok");
        al.add("chetan");
        al.add("girija");

        System.out.println("al="+al);

        // remove the values which starts with a

   // predicate symbol ( -> )

     //   al.removeIf( str -> (str.startsWith("a")));

        //System.out.println("al="+al);

        // remove the values whose length does not equal to 6

        al.removeIf(str -> str.length()!=6 );
        System.out.println("al="+al);
    }
}
