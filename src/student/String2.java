package student;

import java.util.ArrayList;

public class String2 {

    public static void main(String[] args) {
        String str = "88Hello World3";

        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> numbers = new ArrayList<>();

        String temp = "";
        for(int i=0;i<chars.length;i++){
            if(Character.isDigit(chars[i]) ) {
                temp=temp+chars[i];
               // sb.append(chars[i]);
            }
                if (Character.isAlphabetic(chars[i]) ||  (i==chars.length-1)) {
                    if (!temp.equals("") ){
                        numbers.add(Integer.parseInt(temp));
                        temp = "";
                        //sb.setLength(0);
                    }
                }

            //temp="";
        }
        System.out.println(numbers);


        int sum = 0;
        for(int i = 0; i < numbers.size(); i++)
            sum += numbers.get(i);
        System.out.println("Addition of all numbers="+sum);



    }
}
