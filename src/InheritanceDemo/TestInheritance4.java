package InheritanceDemo;

public class TestInheritance4 {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.eat();

        Mamal m = new Mamal();
        m.walk();
        m.eat();

        Reptile r = new Reptile();
        r.scroll();
        r.eat();

        Tiger t = new Tiger();
        t.roar();
        t.walk();
        t.eat();

    }
}

class Reptile extends Animal
{
    void scroll()
    {
        System.out.println("scroll");
    }
}

class Mamal extends Animal
{
    void walk()
    {
        System.out.println("walk");
    }
}

class Tiger extends Mamal
{
    void roar()
    {
        System.out.println("roar");
    }
}

