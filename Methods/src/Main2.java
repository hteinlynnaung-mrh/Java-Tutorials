public class Main2 {

    public static void main(String[] args) {

        // System.out.println(cube(3));

        // fullName = getFullName("Htein Lynn", "Aung");
        // System.out.println(fullName);

        int age = 17;

        if(ageCheck(age)) {
            System.out.println("You may sign up!");
        }
        else {
            System.out.println("You must be 18+ to sign up!");
        }

    }
    static double cube(double number) {
        return number * number * number;
    }
    static String getFullName(String first, String last) {
        return first + " " + last;
    }
    static boolean ageCheck(int age) {
        if(age >= 18) {
            return true;
        }
        else {
            return false;
        }
    }
}
