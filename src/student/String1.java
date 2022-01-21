package student;

public class String1 {

    public static void main(String[] args) {
        String[][] stArr = {
                {"[1,2,5,6]"},
                {"[5,2,8,11,12]"}
        };

        String arrStr1 = stArr[0][0];
        String arrStr2 = stArr[1][0];

        System.out.println("arrStr1="+arrStr1);

        arrStr1 = arrStr1.replace("[","");
        arrStr1 = arrStr1.replace("]","");

        System.out.println("arrStr1="+arrStr1);

        String[] arr1 = arrStr1.split(",");
        int[] arrInt1 = new int[arr1.length];

        for (int i=0;i<arr1.length;i++)
        {
            arrInt1[i] = Integer.parseInt(arr1[i]);
        }



        System.out.println("arrStr2="+arrStr2);

        arrStr2= arrStr2.replace("[","");
        arrStr2 = arrStr2.replace("]","");

        System.out.println("arrStr2="+arrStr2);

        String[] arr2 = arrStr2.split(",");
        int[] arrInt2 = new int[arr2.length];

        for (int i=0;i<arr2.length;i++)
        {
            arrInt2[i] = Integer.parseInt(arr2[i]);
        }


        System.out.println("printing array arr1...");
        for(int i=0;i<arrInt1.length;i++)
            System.out.print(arrInt1[i]+" ");

        System.out.println();

        System.out.println("printing array arr2...");
        for(int i=0;i<arrInt2.length;i++)
            System.out.print(arrInt2[i]+" ");

        int maxlength=0;
        int minlength=0;
        if(arr1.length>arr2.length)
        {   maxlength=arr1.length;
            minlength=arr2.length;
        }
        else if(arr2.length>arr1.length) {
            maxlength = arr2.length;
            minlength = arr1.length;
        }
        else if(arr2.length==arr1.length) {
            maxlength = arr1.length;
            minlength = arr1.length;
        }
        int[] result = new int[maxlength];
        for (int i=0;i<maxlength;i++)
        {
            if(i<minlength)
               result[i] = arrInt1[i]+arrInt2[i];
            else {
                if (maxlength == arrInt1.length)
                    result[i] = arrInt1[i];
                if (maxlength == arrInt2.length)
                    result[i] = arrInt2[i];
            }
        }

        System.out.println("\nResult array --> \n");
        for (int i=0;i<maxlength;i++)
        {

            System.out.print(result[i]+" ");
        }


    }
}
