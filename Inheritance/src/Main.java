public class Main {

    public static void main(String[] args) {

        // Inheritance = One class inherits the attributes and methods
        //               form another class
        //               Child <- Parent <- Grandparent

        // Organism -> Plan and Animal
        // Plant -> Dog and Cat

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(plant.isAlive);

        dog.eat();
        cat.eat();
        plant.photosynthesize();
        
        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();
    }
}
