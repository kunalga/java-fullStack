public class ThrowExceptionFromLife {
    static void validate(int age) throws ArithmeticException {
        if (age < 18)
            throw new NegativeArraySizeException();
        else
            System.out.println("Welcome to vote!");
    }

    public static void main(String[] args) {
        try {
            validate(16);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
        catch(NegativeArraySizeException d1){
            System.out.println("Exception handled: " + d1);
        }
        System.out.println("Program continues...");
    }
}
