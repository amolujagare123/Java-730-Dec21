package CollectionDemo.ArrayListDemos;

import java.util.ArrayList;

public class RemoveIfDemo3 {

    public static void main(String[] args) {

        ArrayList<Character> al = new ArrayList();

        al.add('a');
        al.add('b');
        al.add('c');
        al.add('d');
        al.add('e');
        al.add('f');
        al.add('g');
        al.add('h');
        al.add('i');
        al.add('j');
        al.add('k');
        al.add('l');
        al.add('m');
        al.add('n');
        al.add('o');
        al.add('p');

        System.out.println(al);

       // remove elements which are vowels
        al.removeIf(ch -> ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u');

        System.out.println(al);




    }
}
