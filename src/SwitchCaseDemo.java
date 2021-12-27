public class SwitchCaseDemo {

    public static void main(String[] args) {

        int a = 34;
        int b = 17;
        int c;

        String operation = "dsds";

        switch (operation)
        {
            case "add" : c = a + b;
                System.out.println("Addition="+c);
                break;

            case "sub" : c = a - b;
                System.out.println("Substration="+c);
                break;

            case "mul" : c = a * b;
                System.out.println("Multiply="+c);
                break;

            case "div" : c = a / b;
                System.out.println("Divide="+c);
                break;

            default:
                System.out.println("wrong choice");
                break;
        }


    }
}
