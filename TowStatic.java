class A {
    static int x = 10;
    static {
        System.out.println("Static block of Class A");
    }
    static void showA() { System.out.println("Class A static method"); }
}

class B {
    static int y = 20;
    static {
        System.out.println("Static block of Class B");
    }
    static void showB() { System.out.println("Class B static method"); }
}

public class TowStatic {
    public static void main(String[] args) {
        System.out.println("Main Method Start");
        A objA = new A(); // Class A is loaded now
        B objB = new B(); // Class B is loaded now

        A.showA(); // Static method call
        System.out.println("Value of A.x: " + A.x); // Accessing static variable x from class A
        System.out.println("Value of B.y: "); 
        B.showB(); // Static method call
        System.out.println("Value of B.y: " + B.y); // Accessing static variable y from class B
    }
}