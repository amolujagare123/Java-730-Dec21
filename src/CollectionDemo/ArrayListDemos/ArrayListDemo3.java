package CollectionDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("achyut");
        al.add("ashok");
        al.add("chetan");
        al.add("girija");

        System.out.println("al="+al);

        ArrayList<String> al1 = new ArrayList<>();

        System.out.println("al1="+al1);

        al1.addAll(al);

        System.out.println("al1="+al1);

    }
}
