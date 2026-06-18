import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a studnet? (true/false): ");
        boolean isStudent = scanner.nextBoolean();


        System.out.println("Hello " + name );
        System.out.println("You are " + age + " years old");
        System.out.println("Your GPA is " + gpa);

        if(isStudent) {
            System.out.println("You are enrolled as a student");
        }
        else {
            System.out.println("You are NOT enrolled");
        }

        scanner.close();

    }
}
