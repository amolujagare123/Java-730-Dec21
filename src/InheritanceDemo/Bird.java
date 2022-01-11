package InheritanceDemo;

public class Bird {

    void fly()
    {
        System.out.println("fly");
    }
}

class Sparrow extends Bird
{
    void sparrowColor()
    {
        System.out.println("yellow");
    }
}

class Crow extends Bird
{
    void crowColor()
    {
        System.out.println("black");
    }
}

class TestInheritance1
{
    public static void main(String[] args) {

        Bird b = new Bird();
        b.fly();

        Sparrow s = new Sparrow();
        s.sparrowColor();
        s.fly();

        Crow c = new Crow();
        c.crowColor();
        c.fly();

    }
}