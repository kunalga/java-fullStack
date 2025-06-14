class Person {
    String name;

    // 👨‍👩‍ Constructor of parent class
    Person(String name) {
        this.name = name;
        System.out.println("Person constructor called for: " + name);
    }
}

class Student extends Person {
    int rollNo;

    // 🧱 Constructor of child class using super()
    Student(String name, int rollNo) {
        super(name); // 🧠 Calls parent (Person) constructor
        this.rollNo = rollNo;
        System.out.println("Student constructor called for: Roll No " + rollNo);
    }

    void show() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        Student s1 = new Student("Kunal", 101);
        s1.show();
    }
}