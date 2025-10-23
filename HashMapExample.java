import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Add elements
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Banana");  // duplicate value allowed
        map.put(null, "Mango"); // one null key allowed

        // Access elements
        System.out.println("Value for key 2: " + map.get(null));

        // Remove element
        map.remove(3);
        System.out.println("After removing key 3: " + map);
        System.out.println("Contains key 3? " + map.containsKey(3));
        System.out.println("Contains value 'Banana'? " + map.containsValue("Banana"));
        System.out.println("Size of HashMap: " + map.size());

        


    
    }
}
