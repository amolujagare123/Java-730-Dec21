package InheritanceDemo;

public class Employee {

    int salary = 10000;

    void myEmpMethod()
    {
        System.out.println("Inside employee");
    }
}


class Programmer extends Employee
{

    int bonus = 3000;

    void myMethod()
    {
        bonus = 2000;
    }

    void myProgrammerMethod()
    {
        System.out.println("Inside Programmer");
    }

    public static void main(String[] args) {

        Programmer p = new Programmer();
        System.out.println(p.bonus);
        System.out.println(p.salary);

        p.myProgrammerMethod();
        p.myEmpMethod();
    }
}