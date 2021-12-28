public class IncrementDecrementDemo1 {

    public static void main(String[] args) {

        int i = 10;

        System.out.println(i); // 10
        System.out.println(i++); // 10
        System.out.println(i); // 11
        System.out.println(++i); //12
        System.out.println(i); // 12

        // i++ -->  First statement is executed then increment happens
        // ++i -->  First increment happens then statement is executed
    }

}
