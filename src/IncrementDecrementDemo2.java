public class IncrementDecrementDemo2 {

    public static void main(String[] args) {

        int i = 10;

        System.out.println(i); // 10
        System.out.println(i--); // 10
        System.out.println(i); // 9
        System.out.println(--i); // 8
        System.out.println(i); // 8

        // i-- -->  First statement is executed then decrement happens
        // --i -->  First decrement happens then statement is executed
    }

}
