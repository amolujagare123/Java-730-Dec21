package AbstractionDemo;

import InheritanceDemo.PolymorphismDemo.ClassA;
import pack1.Java1;

public interface InterfaceDemo2 {

    void start();
    void run();

    void display();
}

interface  AnotherInterface
{
    void display();
}

class ChildInterface2 extends ClassA implements InterfaceDemo2, AnotherInterface , InterfaceDemo1
{

    public void start() {
        System.out.println("start");
    }


    public void run() {
        System.out.println("run");
    }


    public void display() {
        System.out.println("display");
    }

    public static void main(String[] args) {

        ChildInterface2 ob = new ChildInterface2();
        ob.display();

    }
}