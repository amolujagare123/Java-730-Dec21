package Methods;

import ClassesNConstructors.MyClass;

public class ReturnTypeDemo3 {

    MyClass getMyObject()
    {
        MyClass myClass = new MyClass();

        myClass.a = 11;
        myClass.d = 1.1;
        myClass.c='a';
        myClass.str="aaa";

        return myClass;
    }

    public static void main(String[] args) {

        ReturnTypeDemo3 ob = new ReturnTypeDemo3();

        MyClass test = new MyClass();
        test = ob.getMyObject();
        test.display(); // a , d ,c ,str

    }
}
