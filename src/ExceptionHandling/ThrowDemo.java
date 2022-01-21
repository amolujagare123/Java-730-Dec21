package ExceptionHandling;

public class ThrowDemo {

    void checkNumber(int x) throws ArithmeticException // between 1 -10
    {
        if(x<=10 && x>=1)
            System.out.println("we are safe");
        else
            throw new ArithmeticException("we are in danger");
    }

    public static void main(String[] args) {

        ThrowDemo ob = new ThrowDemo();
        int i =17;

        ob.checkNumber(i);

        System.out.println("End of the program");
    }
}
