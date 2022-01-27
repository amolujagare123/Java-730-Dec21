package CollectionDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("achyut");
        al.add("ashok");
        al.add("chetan");
        al.add("girija");

        System.out.println(al);

        for(int i =0 ; i<al.size() ;i++)
        {
            System.out.println(al.get(i));
        }

    }
}
