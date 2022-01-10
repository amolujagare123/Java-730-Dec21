package ClassesNConstructors;

public class MyClass6 {

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

    MyClass6(int a, double d, char c, String str) // parameterized constructor with this operator
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }

    public static void main(String[] args) {


        MyClass6 ob = new MyClass6(4,4.5,'j',"pqr");

        ob.display();

    }

}
