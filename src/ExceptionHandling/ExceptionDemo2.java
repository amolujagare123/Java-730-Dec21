package ExceptionHandling;

public class ExceptionDemo2 {

    public static void main(String[] args) {

        int[] a = new int[5];

        try {
            a[0] = 10;
            a[1] = 20;
            a[2] = 30;
            a[3] = 40;
            a[4] = 50;
            a[5] = 60;
        }
        catch (Exception e)
        {

        }

        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);

        System.out.println("End of the program");

    }
}
