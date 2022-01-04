package StringDemo;

public class StringSplit3 {

    public static void main(String[] args) {

        //String str = "this is a java class";
        String str = "this might be his decission";

        String[] myStrArr = str.split("is");

        for(int i=0;i< myStrArr.length;i++) {

            System.out.println(myStrArr[i]);
        }
        
    }
}
