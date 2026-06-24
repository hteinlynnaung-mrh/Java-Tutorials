import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // System.out.println(Math.PI);
        // System.out.println(Math.E);

        double result;

        result= Math.pow(2, 6);
        result= Math.abs(-10); // absolute
        result= Math.sqrt(16);
        result= Math.round(4.77);
        result= Math.ceil(3.14);
        result= Math.floor(6.99);
        result= Math.max(10, 20);
        result= Math.min(10, 20);

        System.out.println(result);

        // HYPOTENUSE c = Math.sqrt(a^2 + b^2)

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse (side C) is: " + c + " cm" );

        scanner.close();



    }
}
