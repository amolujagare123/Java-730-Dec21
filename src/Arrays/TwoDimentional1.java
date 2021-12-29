package Arrays;

public class TwoDimentional1 {

    public static void main(String[] args) {

        int[][] a =new  int[4][3];

        a[0][0] =23;
        a[0][1] =21;
        a[0][2] =22;

        a[1][0] = 32;
        a[1][1] = 42;
        a[1][2] = 52;

        a[2][0] =63;
        a[2][1] =73;
        a[2][2] =83;

        a[3][0] = 92;
        a[3][1] = 11;
        a[3][2] = 33;


        int row = a.length;
        int col = a[0].length;

        System.out.println("Rows="+row);
        System.out.println("Col="+col);


    }
}
