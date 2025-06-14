class DemoSimple {

    // Static variable
    static int a = 10;

    // Static block
    static {
        System.out.println(" Static Block");
    }

    // Instance variables
    int x = 100;

    // Non-static block
    {
        System.out.println(" Instance Block" + x);
    }

    // Constructor
    DemoSimple() {
        System.out.println("Constructor");
    }

    // Static method
    static void showStatic() {
        System.out.println(" Static Method: a = " + a);
    }

    // Non-static method
    void showInstance() {
        System.out.println(" Non-static Method: x = " + x);
    }

    // Main method
    
}

public class StaticTest {
    public static void main(String[] args) {

        System.out.println(" Main Method Start");


      
    }
}