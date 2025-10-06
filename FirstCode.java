// Define an interface
interface Vehicle {
    // Variables in interface (public static final by default)
    int MAX_SPEED = 120; // constant
    String TYPE = "Four Wheeler";

    // Abstract method (no body)
    void start();

    // Abstract method
    void stop();
}

// Implement the interface in a class
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starting... Max Speed: " + MAX_SPEED);
    }

    @Override
    public void stop() {
        System.out.println("Car stopped. Type: " + TYPE);
    }
}

// Main class
public class FirstCode {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.stop();

        // Accessing interface variable directly
        System.out.println("Accessing from interface: " + Vehicle.MAX_SPEED);
        System.out.println("Accessing from interface: " + Vehicle.TYPE);

        // ❌ The following is not allowed because variables are final:
        // Vehicle.MAX_SPEED = 200;  // ERROR
    }
}
