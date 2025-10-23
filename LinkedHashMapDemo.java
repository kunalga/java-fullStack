public class LinkedHashMapDemo {

    public static void main(String[] args) {
        // Create a LinkedHashMap to maintain insertion order
        java.util.LinkedHashMap<Integer, String> linkedHashMap = new java.util.LinkedHashMap<>();

        // Adding key-value pairs to the LinkedHashMap
        linkedHashMap.put(1, "Apple");
        linkedHashMap.put(2, "Banana");
        linkedHashMap.put(3, "Cherry");
        linkedHashMap.put(4, "Date");

        // Displaying the LinkedHashMap
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Accessing elements
        String value = linkedHashMap.get(2);
        System.out.println("Value for key 2: " + value);

 
    }
}