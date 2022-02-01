package CollectionDemo;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("amol");
        ll.add("sohel");
        ll.add("priyanka");
        ll.add("ashish");
        ll.add("manisha");
        ll.add("manisha");

        System.out.println(ll);

        ll.addFirst("First");
        ll.addLast("Last");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);


    }
}
