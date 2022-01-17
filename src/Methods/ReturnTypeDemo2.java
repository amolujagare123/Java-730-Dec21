package Methods;

import java.util.Date;

public class ReturnTypeDemo2 {

    int[] getMyArray()
    {
        int[] a = {12,45,2,11,56,78,12,111};

        return a;
    }

    String[][]  getMyTwoDArray()
    {
        String[][] stAr = {
                {"abc1","xyz1","pqr1"},
                {"abc2","xyz2","pqr2"},
                {"abc3","xyz3","pqr3"},
                {"abc4","xyz4","pqr4"}

        };

        return stAr;
    }


    public static void main(String[] args) {

        ReturnTypeDemo2 ob = new ReturnTypeDemo2();

         int[] x =  ob.getMyArray();

         for (int i=0;i<x.length;i++)
         {
             System.out.println(x[i]);
         }

        String[][] myString = ob.getMyTwoDArray();

         for (int i=0;i<myString.length;i++)
         {
             for(int j=0;j<myString[0].length;j++)
             {
                 System.out.print(myString[i][j]+" ");
             }
             System.out.println();
         }

    }
}
