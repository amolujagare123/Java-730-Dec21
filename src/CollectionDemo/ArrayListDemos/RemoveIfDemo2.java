package CollectionDemo.ArrayListDemos;

import java.util.ArrayList;

public class RemoveIfDemo2 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList();

        al.add(12);
        al.add(22);
        al.add(42);
        al.add(120);
        al.add(222);
        al.add(102);

        System.out.println(al);

       // remove elements which are divisible by 5

        al.removeIf(a -> a%5==0);

        System.out.println(al);





    }
}
