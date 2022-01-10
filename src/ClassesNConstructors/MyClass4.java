package ClassesNConstructors;

public class MyClass4 {

    int a;
    double d;
    char c;
    String str; // data member

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    MyClass4()
    {
        a = 33;
        d =3.3;
        c = 'g';
        str = "xyz";
    }

    public static void main(String[] args) {


        MyClass4 ob = new MyClass4();

        ob.display();

    }

}
