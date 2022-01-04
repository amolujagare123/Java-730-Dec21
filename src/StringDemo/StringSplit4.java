package StringDemo;

public class StringSplit4 {

    public static void main(String[] args) {

        String str = "this is a java class";

        String[] myStrArr = str.split(" ");


       // System.out.println(str.split(" "));

        for(int i=0;i< myStrArr.length;i++) {
            if(myStrArr[i].length()>=2)
            System.out.println(myStrArr[i].substring(1));
        }
        
    }
}
