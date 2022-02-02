package CollectionDemo.QueueDemo;


import java.util.PriorityQueue;

public class QueueDemo1 {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(89);
        pq.offer(19);
        pq.offer(80);
        pq.offer(79);
        pq.offer(43);
        pq.offer(31);

        System.out.println(pq);

        // 19,31,43,79,80,89
        // some os or compilers doesn't support the priority queue
        // so while reviving elements may not seems to be in order
        // but internally they are stored in order only

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
