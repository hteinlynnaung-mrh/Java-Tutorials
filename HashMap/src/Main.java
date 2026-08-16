import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // HashMap = A data structure hat stores key-value pairs
        //           Keys are unique, but Values can be duplicated
        //           Does not maintain any order, but is memory efficient
        //           HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("Pineapple", 0.50);
        map.put("Watermelon", 0.75);
        map.put("Strawberry", 0.25);
        map.put("Coconut", 1.00);

        // map.remove("Pineapple");
        // System.out.println(map.get("Coconut"));
        // System.out.println(map.containsKey("Coconut"));
        // System.out.println(map.containsValue(1.00));
        // System.out.println(map.size());

        System.out.println(map);

        if(map.containsKey("Pineapple")){
            System.out.println(map.get("Pineapple"));
            System.out.println();
        }else{
            System.out.println("Key not found!");
        }

        for(String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }
    }

}
