package CollectionDemo.VectorDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo1 {

    public static void main(String[] args) {


        Vector<String> v = new Vector<>();
        System.out.println(v.size()); // 0
        System.out.println(v.capacity()); // 10

        v.add("amol");
           v.add("sohel");
           v.add("priyanka");
           v.add("ashish");
           v.add("manisha");
           v.add("manisha");
        v.add("amol");
        v.add("sohel");
        v.add("priyanka");
        v.add("ashish");
        v.add("ashish");



        System.out.println(v.size()); // 11
        System.out.println(v.capacity());// 20

        System.out.println(v);


    /*    Iterator itr = v.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }*/

        Enumeration e = v.elements();

        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }

    }
}
