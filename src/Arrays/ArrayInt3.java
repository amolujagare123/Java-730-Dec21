package Arrays;

public class ArrayInt3 {

    public static void main(String[] args) {

        int[] a = {23,12,56,12,67,89,12,12,111,67,8};

  //      print even or odd infront of each value of an array

     for (int i=0;i<a.length;i++) {

         if( a[i] % 2 == 0)
          System.out.println(a[i]+" even");

         else if( a[i]%2 != 0)
             System.out.println(a[i]+" odd");
     }

    }
}
