package Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[7];

        a[0] = 89;
        a[1] = 19;
        a[2] = 82;
        a[3] = 79;
        a[4] = 84;
        a[5] = 49;
        a[6] = 11;

        int l = a.length;
        //System.out.println(a[2]);

        /*for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }*/

        for(int x:a) // for each loop
            System.out.println(x);

    }
}
