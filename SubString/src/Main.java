import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // .substring() = A method used to extract a portion of a string
        //                string.substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")) {
            username = email.substring(0, email.indexOf("@")); // (0, 8);
            domain = email.substring(email.indexOf("@"));  // (9) // (9, 18) // If I +1 behind the ("@") that forward one place

            System.out.println("\nUser Name is: " + username);
            System.out.println("Domain is   : " + domain);
        }
        else {
            System.out.println("Email must contain @");
        }

        scanner.close();

    }
}
