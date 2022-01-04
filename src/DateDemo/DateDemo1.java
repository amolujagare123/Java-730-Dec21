package DateDemo;

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
    }
}
