package InheritanceDemo;

public class Animal {

    void eat()
    {
        System.out.println("eat (old/animal class)");
    }
}

class Dog extends Animal
{
    void barks()
    {
        System.out.println("barks");
    }
}
class BabyDog extends Dog
{
    void weeps()
    {
        System.out.println("weeps");
    }
}

class TestInheritance
{
    public static void main(String[] args) {

        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.barks();
        d.eat();

        BabyDog bd = new BabyDog();
        bd.weeps();
        bd.barks();
        bd.eat();

    }
}