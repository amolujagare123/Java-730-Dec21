package CollectionDemo.StackDemo;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        s.push("amol");
        s.push("achyut");
        s.push("ashok");
        s.push("chetan");
        s.push("girija");

        System.out.println(s);

        System.out.println(s.search("chetan"));

    }
}
