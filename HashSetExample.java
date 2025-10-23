import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> fruits = new HashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // duplicate, will not be added

        // Display HashSet
        System.out.println("Fruits: " + fruits);

        // Check if element exists
        System.out.println("Contains Banana? " + fruits.contains("Banana"));

        // Remove an element
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);

        // Size of HashSet
        System.out.println("Size: " + fruits.size());

        // Iterate using for-each
        System.out.println("Iterating:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
