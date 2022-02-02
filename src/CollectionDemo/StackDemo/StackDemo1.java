package CollectionDemo.StackDemo;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();
        System.out.println(s.empty());

        s.push("amol");
        s.push("achyut");
        s.push("ashok");
        s.push("chetan");
        s.push("girija");
        System.out.println(s.empty());
        System.out.println(s);

        System.out.println(s.pop());

        System.out.println(s);

        System.out.println(s.peek());
        System.out.println(s);
    }
}
