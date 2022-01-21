package staticFinal;

public class StaticMethodDemo {


   public int rno;
    public String name;
    public static String college="ITS";

    public void display()
    {
        System.out.println("rno="+rno); // non static members allowed
        System.out.println("name="+name); // non static members allowed
        System.out.println("college="+college);//  static members allowed
        myStaticMethod2();//  static members allowed
        myStaticMethod();//  static members allowed

    }

    public static void myStaticMethod2()
    {
        System.out.println("static method");
    }

    public static void myStaticMethod()
    {
       // System.out.println("rno="+rno); // non static members not allowed
      //  System.out.println("name="+name); // non static members not allowed
        System.out.println("college="+college); //  static members allowed

      //  display(); // non static members not allowed

        myStaticMethod2();//  static members allowed


    }

    public static void main(String[] args) {

        StaticMethodDemo ob = new StaticMethodDemo();
        ob.myStaticMethod2(); // static method call using object
        StaticMethodDemo.myStaticMethod2(); // static method call using class name
    }
}
