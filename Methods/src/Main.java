public class Main {

    public static void main(String[] args) {

        // method = a block of reusable code that is executed when called ()

        String name = "Htein Lynn Aung";
        int age = 25;

        happyBirthday(name, age);
    }
    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }
}
