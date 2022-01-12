package Methods;

public class ReturnTypeDemo1 {


    int myIntMethod()
    {
        float x =12;
        int a = 78;
        return a;
    }


    public static void main(String[] args) {

        int x = 10 ;

        int y = x ;

        System.out.println(x);
        System.out.println(y);



        ReturnTypeDemo1 ob = new ReturnTypeDemo1();

        int a = ob.myIntMethod();

        System.out.println(a);
        System.out.println(ob.myIntMethod());

    }
}
