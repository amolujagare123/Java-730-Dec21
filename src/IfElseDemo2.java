public class IfElseDemo2 {

    public static void main(String[] args) {

        int a = 100;
        int b = 200 ;

        if(a>b) // if ... else if ladder
        {
            System.out.println("a is greater");
        }

        else if (b>a)
        {
            System.out.println("b is greater");
        }

        else if (b==a)
        {
            System.out.println("a & b are equal");
        }



    }
}
