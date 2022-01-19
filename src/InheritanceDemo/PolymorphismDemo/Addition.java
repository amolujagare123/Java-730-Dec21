package InheritanceDemo.PolymorphismDemo;

public class Addition {

    int a ;
    int b;

    void add()
    {
        int c ;
        c = a + b;
        System.out.println("Addition="+c);
    }

    void add(int d)
    {
        int c ;
        c = a + b + d;
        System.out.println("Addition="+c);
    }

    void add (int x , int y)
    {
        int c ;
        c = x + y ;
        System.out.println("Addition="+c);
    }

    void add (int x , int y , int z)
    {
        int c ;
        c = x + y + z ;
        System.out.println("Addition="+c);
    }

    void add(double d1 , double d2)
    {
        double c ;
        c = d1 + d2 ;
        System.out.println("Addition="+c);
    }

    void add(String str1 , String str2)
    {
        String c ;
        c = str1 + str2 ;
        System.out.println("Addition="+c);
    }

    public static void main(String[] args) {

        Addition ob = new Addition();
        ob.a = 34;
        ob.b = 66;
        ob.add();

        ob.add(50);
        ob.add(13,24);
        ob.add(13,24,13);
        ob.add(13.21,24.11);
        ob.add("Selenium","Java");
        /**
         *
         * ob.add('a','c');
         *
         */

        ob.add('a','c');

    }
}
