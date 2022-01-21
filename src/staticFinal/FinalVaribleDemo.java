package staticFinal;

public class FinalVaribleDemo {

    final int speed = 70;

    void change()
    {
        //speed = 100;
    }

    public static void main(String[] args) {
        FinalVaribleDemo ob = new FinalVaribleDemo();
        ob.change();
       // ob.speed =90;
        System.out.println(ob.speed);
    }
}
