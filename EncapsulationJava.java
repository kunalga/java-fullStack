
    // Encapsulation Example in Java
class Student {
    // Private data members (data hiding)
    private String name;
    private int age;

    // Public getter method for 'name'
    public String getName() {
        return name;
    }

    // Public setter method for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for 'age'
    public int getAge() {
        return age;
    }

    // Setter method for 'age'
    public void setAge(int age) {
        if (age > 0) { // Validation logic
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class EncapsulationJava {
    public static void main(String[] args) {
        // Create object of Student
        Student s1 = new Student();

        // Set values using setter methods
        s1.setName("Kunal");
        s1.setAge(23);

        // Get values using getter methods
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Age: " + s1.getAge());

        // Try invalid age
        s1.setAge(-5); // prints validation message
    }
}


