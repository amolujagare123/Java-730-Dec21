package Arrays;

public class TwoDArrayString {

    public static void main(String[] args) {

        String[][] stArr = { // stArr.length
                {"abc1","pqr1","xyz1"}, // stArr[0].length
                {"abc2","pqr2","xyz2"},// stArr[1].length
                {"abc3","pqr3","xyz3"},// stArr[2].length
                {"abc4","pqr4","xyz4"},// stArr[3].length
        };

        int[] a = {23,12,56,15}; // a.length

        System.out.println("rows="+stArr.length);
        System.out.println("cols="+stArr[0].length);

        System.out.println(stArr[3][1]);

       /* for(int i=0;i<stArr.length;i++)
        {
            for (int j=0;j<stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+" ");
            }
            System.out.println();
        }*/


    }
}
