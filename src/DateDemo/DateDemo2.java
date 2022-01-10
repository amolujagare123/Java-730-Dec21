package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

    public static void main(String[] args) throws ParseException {

        String dateStr = "24/11/2019";

        // String to date

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

        Date myDate = sd.parse(dateStr);

        System.out.println(myDate);

        String dateStr0= "23-June-2016" ;
        //→ dd-MMMM-yyyy

        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        Date myDate0 = sd0.parse(dateStr0);
        System.out.println(myDate0);


        String dateStr1= "23 | June 16  8:34" ;
        //→ dd | MMMM yy hh:mm

        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        Date myDate1 = sd1.parse(dateStr1);
        System.out.println(myDate1);

        String dateStr2= "2016-06-23 | 8:34:23";
        //→yyyy-MM-dd | hh:mm:ss

        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd | hh:mm:ss");
        Date myDate2 = sd2.parse(dateStr2);
        System.out.println(myDate2);

        String dateStr3= "Thursday 2016/06/23";
        //→ EEEE yyyy/MM/dd

        SimpleDateFormat sd3 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        Date myDate3 = sd3.parse(dateStr3);
        System.out.println(myDate3);

        String dateStr4= "23-06-2016 | thu | 8:34" ;
        //→ dd-MM-yyyy | E | hh:mm
        SimpleDateFormat sd4 = new SimpleDateFormat("dd-MM-yyyy | E | hh:mm");
        Date myDate4 = sd4.parse(dateStr4);
        System.out.println(myDate4);

        String dateStr5= "8:34:22";
        //→ hh:mm:ss
        SimpleDateFormat sd5 = new SimpleDateFormat("hh:mm:ss");
        Date myDate5 = sd5.parse(dateStr5);
        System.out.println(myDate5);


    }
}
