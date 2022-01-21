package staticFinal;

public final class ClassA {

    /*final*/ void myDisplay()
    {
        System.out.println("ClassA Display");
    }
}

class ClassB /*extends ClassA*/
{
    void myDisplay()
    {
        System.out.println("ClassB Display");
    }

    public static void main(String[] args) {
      //  ClassA ob = new ClassB();
      //  ob.myDisplay(); // overridden method must be called
        // through the reference variable of parent class

    }
}
