package StringDemo;

public class StringSplit2 {

    public static void main(String[] args) {

        String str = "Hey baby you are so lovely";
        String[] myStr = str.split(" ");

        // print only the words that ends with 'y'

        /*for(int i=0;i<myStr.length;i++)
        {
            int l = myStr[i].length();

            if(myStr[i].charAt(l-1)=='y')
              System.out.println(myStr[i]);
        }*/


        for(int i=0;i<myStr.length;i++)
        {
           /* int l = myStr[i].length();*/

            if(myStr[i].endsWith("y"))
                System.out.println(myStr[i]);
        }

    }
}
