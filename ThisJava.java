// Demonstration of constructor chaining using 'this' keyword
class Student {
    String city;
    int age;

    // Constructor 1
    Student() {
        this("Unknown", 18); // Calls Constructor 2
    }

    // Constructor 2
    Student(String city, int age) {
        this.city = city;
        this.age = age;
    }

    void printInfo() {
        System.out.println("City: " + city + ", Age: " + age);
    }
}

public class ThisJava {
    public static void main(String[] args) {
        Student st = new Student();
        st.printInfo(); // Output: City: Unknown, Age: 18
    }
}
