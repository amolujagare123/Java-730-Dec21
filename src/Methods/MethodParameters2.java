package Methods;

public class MethodParameters2 {

      void getMyArray(int[] a)
      {
          for (int i=0;i<a.length;i++)
              System.out.println(a[i]);
      }

      void getMyTwoDArray(String[][] sAr)
      {
          for (int i=0;i<sAr.length;i++)
          {
              for (int j=0;j<sAr[0].length;j++)
              {
                  System.out.print(sAr[i][j]+" ");
              }
              System.out.println();
          }

      }

    public static void main(String[] args) {

        MethodParameters2 ob = new MethodParameters2();

        int[] x = {3,1,4,1,11,43,21,10};

        ob.getMyArray(x);

        String[][] testArray = {
                {"abcd1","xyz1","pqr1"}  ,
                {"abcd2","xyz2","pqr2"}  ,
                {"abcd3","xyz3","pqr3"}  ,
                {"abcd4","xyz4","pqr4"}  ,
                {"abcd5","xyz5","pqr5"}  ,
        };

        ob.getMyTwoDArray(testArray);
    }
}
