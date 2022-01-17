package ClassesNConstructors;

public class MyClass {

    public int a;
    public double d;
    public char c;
    public String str; // data member

    public void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }


    public static void main(String[] args) {

        int x = 10;
        System.out.println(x);

        MyClass ob = new MyClass();

        ob.a = 11;
        ob.d =1.1;
        ob.c='f';
        ob.str="amol";

        ob.display();

        MyClass ob1 = new MyClass();

        ob1.a = 22;
        ob1.d =2.2;
        ob1.c='d';
        ob1.str="xyz";
        ob1.display();

    }

}
