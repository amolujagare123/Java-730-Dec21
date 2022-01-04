package StringDemo;

public class StringSplit1 {

    public static void main(String[] args) {

        String str = "we are from the nation India";
        String[] myStr = str.split(" ");

        /*for(String a : stArr)
            System.out.println(a);*/

        for(int i=0;i<myStr.length;i++)
        {
            System.out.println(myStr[i]);
        }

    }
}
