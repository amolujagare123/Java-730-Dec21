package Arrays;

public class TwoDimentional2 {

    public static void main(String[] args) {

        // 4 x 3

        int[][] a = {
                {1,1,1},
                {2,2,2},
                {3,3,3},
                {4,4,4}
        };



        int row = a.length;
        int col = a[0].length;

        System.out.println("Rows="+row);
        System.out.println("Col="+col);

        for(int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++) //
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }



    }
}
