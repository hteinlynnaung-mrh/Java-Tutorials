public class Main {

    public static void main(String[] args) {

        // The help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

        Car car = new Car("Bentley", "Red", 50000);

        car.setColor("White");
        car.setPrice(55000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

    }
}
