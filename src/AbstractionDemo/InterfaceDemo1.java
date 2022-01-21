package AbstractionDemo;

public interface InterfaceDemo1 {

        void start();
        void run();
      //  void call();

        static void display() // public
        {
            System.out.println("display");
        }

        default void display1()
        {
                System.out.println("display");
        }

        private void display2()
        {
                System.out.println("display");
        }


}

class ChildInteface implements InterfaceDemo1
{
        public void start()
        {
                System.out.println("Start");
        }

        public void run()
        {
                System.out.println("run");
        }

        public static void main(String[] args) {

                InterfaceDemo1 ob = new ChildInteface();
                ob.run();
                ob.start();
                ob.display1();
                InterfaceDemo1.display();
             //   ob.display2();
        }
}
