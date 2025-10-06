class Student {
    // Static variable - shared by all objects
    static String college = "SRM University";

    // Instance variable - each object has its own
    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Static method
    static void changeCollege(String newCollege) {
        college = newCollege;
    }

    // Non-static method
    void display() {
        System.out.println(name + " (" + age + ") - " + college);
    }

    // Static block
    static {
        System.out.println("Class Loaded! Static block executed.");
    }
    {
        System.out.println("Instance Created! Non-static block executed.");
    }
}

public class StaticDemo {
    static {
        System.out.println("StaticDemo Class Loaded! Static block executed.");
    }

    static int x = 10;
    {
        System.out.println("StaticDemo Instance Created! Non-static block executed.");
    }
    public static void main(String[] args) {
        // Static block runs automatically when class is loaded
        System.out.println("Inside main method.");
        Student s1 = new Student("Kunal", 23);
        Student s2 = new Student("Aman", 22);

        // Both share same college (static variable)
        s1.display();
        s2.display();

        // Changing static variable using static method
        Student.changeCollege("Delhi University");

        s1.display();
        s2.display();
        StaticDemo demo = new StaticDemo();  // This will trigger instance block


    }
    
}
