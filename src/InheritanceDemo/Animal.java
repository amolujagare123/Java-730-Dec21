package InheritanceDemo;

public class Animal {

    String color = "default color";

    void eat()
    {
        System.out.println("eat (old/animal class)");
    }
}

class Dog extends Animal
{
    String color = "Black";
    void barks()
    {
        System.out.println("barks");
    }
}
class BabyDog extends Dog
{
    String color = "white";
    void weeps()
    {
        System.out.println("weeps");
        System.out.println(color);
        System.out.println(super.color);
    }
}

class TestInheritance
{
    public static void main(String[] args) {

     /*   Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.barks();
        d.eat();

        BabyDog bd = new BabyDog();
        bd.weeps();
        bd.barks();
        bd.eat();*/

        BabyDog bd = new BabyDog();
        bd.weeps();

    }
}