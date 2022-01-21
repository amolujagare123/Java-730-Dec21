package AbstractionDemo;

public abstract class AbstractDemo {

    abstract void start();
    abstract void run();

    void display()
    {
        System.out.println("display");
    }

   /* public static void main(String[] args) {
        AbstractDemo ob = new AbstractDemo();
    }*/
}

class ChildAbstract extends AbstractDemo
{
    void start()
    {
        System.out.println("Start");
    }

    void run()
    {
        System.out.println("run");
    }

    public static void main(String[] args) {

        AbstractDemo ob = new ChildAbstract(); // upcasting
        ob.display();
        ob.start();
        ob.run();

    }
}
