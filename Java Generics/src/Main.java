import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Generics = A concept where you can write a class, interface, or method
        //            that is compatible with different data types.
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String> type argument-data type (specifies the type)

        // Box<String> box = new Box<>();

        // box.setItem("Strawberry");

        // System.out.println(box.getItem());

        Product<String, Double> product1 = new Product<>("Watermelon", 0.50);
        Product<String, Double> product2 = new Product<>("Pineapple", 0.70);

        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());

        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }

}
