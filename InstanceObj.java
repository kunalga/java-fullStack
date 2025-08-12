class Employee {
    static {
        System.out.println("Employee.class file is loading by JVM");
    }

    public Employee() {
        System.out.println("Employee object is created");
    }
}
public class InstanceObj {
     static {
        System.out.println("InstanceObj.class file is loading by JVM");
    }
    public static void main(String[] args) throws Exception {
        String className = args[0];  // Get class name from command line

        // Dynamically load the class and create its object
        Object obj = Class.forName(className).newInstance();

        // Print the loaded class name
        System.out.println("Loaded class: " + obj.getClass().getName());
    }

}
