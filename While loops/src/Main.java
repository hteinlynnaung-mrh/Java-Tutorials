import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // while loop = repeat some code forever
        //              while some condition remains true

        Scanner scanner = new Scanner(System.in);

        String name = "";

        /* if(name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        } */

        while(name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        scanner.close();

    }
}
