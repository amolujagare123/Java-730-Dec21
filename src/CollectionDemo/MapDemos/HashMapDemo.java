package CollectionDemo.MapDemos;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap hm = new HashMap();
        hm.put(103,"amol");
        hm.put(203,"rahul");
        hm.put('g',2121);
        hm.put(true,1.2);
        hm.put(false,1.2);
        hm.put("103","amol");
        hm.put("103",'f');
        hm.put(22,null);
        hm.put(21,null);
        hm.put(20,null);
        hm.put(null,"java");
        hm.put(null,"123");

        System.out.println(hm);
    }
}
