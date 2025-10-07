public class ExceptionObjectDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // causes ArithmeticException
        } catch (ArithmeticException e) {
            // e is an exception object
            System.out.println("Class name: " + e.getClass().getName());
            System.out.println("Message: " + e.getMessage());
            System.out.println("toString(): " + e.toString());
            System.out.println("Stack trace:");
            e.printStackTrace();
        }
    }
}
