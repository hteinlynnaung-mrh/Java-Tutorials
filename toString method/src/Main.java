public class Main {

    public static void main(String[] args) {

        // .toString() = Methods inherited from the Object class.
        //               Used to t return a string representation of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful details.

        Car car1 = new Car("Bentley", "Flying Spur", 2025, "White");
        Car car2 = new Car("Chevrolet", "Corvette", 2020, "Red");

        System.out.println(car1);
        System.out.println(car2);

     // System.out.println(car.color + " " + car.year + " " + car.make + " " + car.model);

    }
}