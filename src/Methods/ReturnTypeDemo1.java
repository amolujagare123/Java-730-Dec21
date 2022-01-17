package Methods;

import java.util.Date;

public class ReturnTypeDemo1 {


    int myIntMethod()
    {
        float x =12;
        int a = 78;
        int y = 70;
        int z = 71;
        return a;
    }

    float myFloatMethod()
    {
        float f =23.34f;

        return f;
    }

    double myDoubleMethod()
    {
        double d = 8.9;
        return  d;
    }

    String myStringDemo()
    {
        String str = "this is a java class";

        return str;
    }

    Date myDate()
    {

        return new Date();
    }



    public static void main(String[] args) {

        int x = 10 ;

        int y = x ;

        System.out.println(x);
        System.out.println(y);



        ReturnTypeDemo1 ob = new ReturnTypeDemo1();

        int a = ob.myIntMethod();

        System.out.println(a);
        System.out.println(ob.myIntMethod());

        System.out.println(ob.myDoubleMethod());
        System.out.println(ob.myFloatMethod());

        System.out.println(ob.myStringDemo());

        System.out.println(ob.myDate());

    }
}
