package pack2;

import pack1.Java1;
import staticFinal.StaticMethodDemo;
import static staticFinal.StaticMethodDemo.college;
import static staticFinal.StaticMethodDemo.myStaticMethod;

public class Java4 {

    public static void main(String[] args) {

        Java1 ob = new Java1();

        ob.a = 11;
        ob.d = 1.1;
     //   ob.str = "";

        StaticMethodDemo sm = new StaticMethodDemo();
        sm.myStaticMethod2(); // static members accessed using object
        sm.college="its";

        myStaticMethod();// static members accessed using class name
        StaticMethodDemo.college="its";

        college = "PICT";
        myStaticMethod();
    }
}
