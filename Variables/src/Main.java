public class Main {

    public static void main(String[] args) {

        // THIS IS MY FIRST JAVA PROGRAM

        int age = 21;
        int year = 2026;
        int quantity = 2;

        double price = 19999.99;
        double gpa = 3.6;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        String name = "Htein Lynn Aung";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Bentley";
        String color = "red";


        System.out.println("I Like Pizza!");
        System.out.println("It's really good!");
        System.out.println("Buy me Pizza!");
        System.out.println("Hello Java JDK and Intelli-J IDE");
        System.out.println(age);
        System.out.println("Your email address is: " + email);
        System.out.println("Your age is " + age + " years old");
        System.out.println("My car is " + car);
        System.out.println("Your choice is a " + year + color + car);
        System.out.println("The price is " + price + currency);

        if(isStudent) {
            System.out.println("You are a student!");
        }
        else{
            System.out.println("Your are not a student!");
        }

        if(forSale) {
            System.out.println("There is a " + car + " for sale");
        }
        else{
            System.out.println("The " + car + " is not for sale");
        }
    }

}
