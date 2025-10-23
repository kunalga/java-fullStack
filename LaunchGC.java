
import java.util.HashMap;
import java.util.WeakHashMap;

class Employee {
    @Override
    protected void finalize() {
        System.out.println("Garbage Collector collected the object");
    }

    // You can add setters and getters if needed
}

public class LaunchGC {
    public static void main(String[] args) {
        Employee e = new Employee();  // Create an Employee object

        // Statements (simulate object use)
        System.out.println("Employee object created");
        WeakHashMap<Employee, String> map = new WeakHashMap<>();
        map.put(e, "Some Value");

        // Make object eligible for garbage collection
        e = null;

        // Call Garbage Collector explicitly
        System.gc();

        System.out.println("Main method completed");
    }
}
