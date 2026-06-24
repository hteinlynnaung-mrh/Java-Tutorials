public class Main {

    public static void main(String[] args) {

        // ternary operator ? = Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        int score = 75;
        String passOrFail = (score >= 60) ? "PASS" : "FAIL"; // another form of the if statement

        int number = 4;
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

        int hours = 13;
        String timeOfDay = (hours < 12) ? "A.M" : "P.M";

        int income = 60000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(passOrFail);
        System.out.println(evenOrOdd);
        System.out.println(timeOfDay);
        System.out.println(taxRate);

    }
}
