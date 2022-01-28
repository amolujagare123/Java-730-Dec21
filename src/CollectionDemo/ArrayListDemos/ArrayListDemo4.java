package CollectionDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo4 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList();
        al.add(12);
        al.add(22);
        al.add(42);
        al.add(120);
        al.add(222);
        al.add(102);

        System.out.println(al);

        al.remove(4);

        System.out.println(al);

        Integer ob = 120;

        System.out.println(al.remove(ob));
       // al.remove(new Integer(120));

        System.out.println(al);

        al.clear();

        System.out.println(al);



    }
}
