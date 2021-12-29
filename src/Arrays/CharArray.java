package Arrays;

public class CharArray {

    public static void main(String[] args) {

        char[] ch = new char[5];

        ch[0] = 'j';
        ch[1] = 'a';
        ch[2] = 's';
        ch[3] = 't';
        ch[4] = 'k';

       /* for (int i=0;i<ch.length;i++)
            System.out.println(ch[i]);*/

        for(char c : ch)
            System.out.println(c);
    }
}
