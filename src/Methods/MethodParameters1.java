package Methods;

public class MethodParameters1 {

    void myMethod(int a)
    {
        System.out.println("a="+a);
    }

    void areaOfSquare(int side)
    {
        int area = side * side;
        System.out.println("area of square="+area);
    }

    void areaOfRectangle(int length,int breadth)
    {
        int area = length * breadth;
        System.out.println("area of a rectangle="+area);
    }

    void area(String diagram,int value)
    {
        System.out.println("Diagram="+diagram);
        System.out.println("Value="+value);
    }


    public static void main(String[] args) {

        MethodParameters1 ob = new MethodParameters1();
        ob.myMethod(23);

        ob.areaOfSquare(10);

        ob.areaOfRectangle(23,10);
        ob.area("circle",90);
    }
}
