public class Main2 {

    public static void main(String[] args) {

        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object.
        //                   Allows use of Collectins Framework and static Utility Methods.

        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("true");

        // String x = a + b + c + d;
        // can't use the + operator between numbers and boolean (d)
        String x = " " + a + b + c + d;

        System.out.println(x);

    }
}

