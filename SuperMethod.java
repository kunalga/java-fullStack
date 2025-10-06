class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    int age;

    Student(String name, int age) {
        super(name); // Calls Person's constructor
        this.age = age;
    }

    void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        Student st = new Student("Kunal", 22);
        st.printInfo(); // Output: Name: Kunal, Age: 22
    }
}
