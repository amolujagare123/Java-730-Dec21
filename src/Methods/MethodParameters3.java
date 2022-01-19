package Methods;

import ClassesNConstructors.MyClass;

public class MethodParameters3 {

    void setMyObject(MyClass obj)
    {
        obj.a = 10;
        obj.d = 1.2;
        obj.c = 's';
        obj.str = "string";
    }

    public static void main(String[] args) {

        MethodParameters3 ob = new MethodParameters3();

        MyClass myClass = new MyClass();

        ob.setMyObject(myClass);

        myClass.display();


    }
}
