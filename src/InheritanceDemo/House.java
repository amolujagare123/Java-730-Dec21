package InheritanceDemo;

public class House {

    House()
    {

        System.out.println("my house");
    }

    String color = "green";

    void roomsInfo()
    {
        System.out.println("This is the house rooms info");
    }
}

class Apartment extends House
{
    String color = "sky blue";
    //   String color = "green";

    Apartment()
    {
        super();
        System.out.println("my apartment");
    }

    void roomsInfo()
    {
        System.out.println("This is the Apartment rooms info");
    }
    void displayColor()
    {
        System.out.println("color="+color);
        System.out.println("color="+super.color); // super refer to the parent class member

        roomsInfo();
        super.roomsInfo();
    }

}

class TestInheritance5
{
    public static void main(String[] args) {

        Apartment ap = new Apartment();
       // ap.displayColor();
    }
}