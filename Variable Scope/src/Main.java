import java.sql.SQLOutput;

public class Main {

    static int x = 3; // CLASS variable declare inside the class

    public static void main(String[] args) {

        // variable scope = where a variable can be accessed

        int x = 1;  //  LOCAL Variable declare inside static void

        System.out.println(x);

        doSomething();
    }
    static void doSomething() {
        int x = 2; // LOCAL Variable

        System.out.println(x);
    }
}
