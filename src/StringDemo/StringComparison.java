package StringDemo;

public class StringComparison {

    public static void main(String[] args) {

        String str1 ="amol";
        String str2 ="amol";
        String str3 ="Amol";
        String str4 ="sneha";
        String str5 ="Depthi";
        String str6 = new String("amol");

        int a = 10;
        int b = 10;

      //  System.out.println(a==b);

     /*   System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str6));*/

        System.out.println(str1==str2);
        System.out.println(str1==str6);

    }
}
