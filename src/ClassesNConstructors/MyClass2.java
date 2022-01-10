package ClassesNConstructors;

public class MyClass2 {

    void myMethod()
    {
        MyClass ob = new MyClass();

        ob.a =10;
        ob.d=2.2;
        ob.c ='g';
        ob.str ="abcd";
        ob.display();
    }

    public static void main(String[] args) {
        MyClass2 obj =new MyClass2();
        obj.myMethod();
    }
}
