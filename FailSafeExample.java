import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;

public class FailSafeExample {
    public static void main(String[] args) {
        // Creating a CopyOnWriteArrayList (Fail-Safe)
        CopyOnWriteArrayList<String> names = new CopyOnWriteArrayList<>();
        names.add("Kunal");
        names.add("Rohit");
        names.add("Amit");

        // Getting iterator
        Iterator<String> itr = names.iterator();

        while (itr.hasNext()) {
            String name = itr.next();
            System.out.println(name);

            // Modifying collection while iterating (allowed)
            if (name.equals("Rohit")) {
                names.add("Vikas"); // ✅ No Exception
            }
        }

        System.out.println("After adding: " + names);
    }
}
