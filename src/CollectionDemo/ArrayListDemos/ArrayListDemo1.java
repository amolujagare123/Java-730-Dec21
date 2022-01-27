package CollectionDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add("amol");
        al.add(1.30);
        al.add(true);
        al.add(true);

        System.out.println(al);

        System.out.println("size="+al.size());

        System.out.println("element at index 3="+al.get(3));


    }

}
