public class Main {

    public static void main(String[] args) {

        /* Car car1 = new Car("Bentley", "White");
           Car car2 = new Car("Ferrari", "Red");
           Car car3 = new Car("Porsche", "Black");

           Car[] cars = {car1, car2,car3};
         */

        Car[] cars = {new Car("Bentley", "White"),
                      new Car("Ferrari", "Red"),
                      new Car("Porsche", "Black")};

        /* for(int i = 0; i < cars.length; i++){
            cars[i].drive();
        }
         */

        /* for(Car car: cars){
            car.color = "black";
         */

        for(Car car : cars){
            car.drive();
        }

    }
}
