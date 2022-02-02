package CollectionDemo.QueueDemo;

import java.util.ArrayDeque;

public class QueueDemo2 {

    public static void main(String[] args) {

        ArrayDeque<String> adq = new ArrayDeque<>();

        adq.offer("Santosh");
        adq.offer("Rupa");
        adq.offer("Ram");
        adq.offer("Rahul");
        adq.offer("Nandkumar");

        System.out.println(adq);

        adq.offerFirst("first");
        adq.offerLast("last");

        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);

    }
}
