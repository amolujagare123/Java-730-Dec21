package pack1;

import ClassesNConstructors.MyClass;

public class Java1 {
    public int a;
    public double d;
    private char c;
    protected String str; // data member

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }


    public static void main(String[] args) {

        Java1 ob = new Java1();

        ob.a = 11;
        ob.d =1.1;
        ob.c='f';
        ob.str="amol";

        ob.display();
    }

    }
