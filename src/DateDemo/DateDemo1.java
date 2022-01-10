package DateDemo;

import ClassesNConstructors.MyClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {


    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date); // 04/01/2022

        // convert date into string ( with our desired format)

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        String dateStr = sd.format(date);
        System.out.println(dateStr);

        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        String dateStr0 = sd0.format(date);
        System.out.println(dateStr0);


        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        String dateStr1 = sd1.format(date);
        System.out.println(dateStr1);

        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd | hh:mm:ss");
        String dateStr2 = sd2.format(date);
        System.out.println(dateStr2);


        SimpleDateFormat sd3 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        String dateStr3 = sd3.format(date);
        System.out.println(dateStr3);

        SimpleDateFormat sd4 = new SimpleDateFormat("dd-MM-yyyy | E | hh:mm");
        String dateStr4 = sd4.format(date);
        System.out.println(dateStr4);


        SimpleDateFormat sd5 = new SimpleDateFormat("hh:mm:ss");
        String dateStr5 = sd5.format(date);
        System.out.println(dateStr5);




    }
}
