import java.util.*;

public class FailFastExample {
    public static void main(String[] args) {
        // Creating a LinkedHashSet (Fail-Fast)
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Kunal");
        names.add("Rohit");
        names.add("Amit");
        // Getting iterator

        for (String name : names) {
            System.out.println(name);

            // Modifying collection while iterating (not allowed)
            if (name.equals("Rohit")) {
                names.add("Vikas"); // ❌ Causes ConcurrentModificationException
            }
        }
    }
}
