package CollectionDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo7 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("achyut");
        al.add("ashok");
        al.add("chetan");
        al.add("girija");

        System.out.println("al="+al);

        ArrayList<String> al1 = new ArrayList<>();

        al1.add("amol");
        al1.add("achyut");
        al1.add("ashok");
        al1.add("sneha");
        al1.add("rahul");
        al1.add("sohel");

        System.out.println("al1="+al1);

        al1.removeAll(al);

        System.out.println("al1="+al1);


    }
}
