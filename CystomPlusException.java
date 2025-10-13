class CalculatorException extends Exception {
    public CalculatorException(String message) {
        System.err.println("CalculatorException: " + message);
        }

}
public class CystomPlusException {
    public static void main(String[] args) throws CalculatorException {
        try {
            int result = 10 / 0; // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " );
            throw new CalculatorException("Custom exception triggered due to arithmetic error");
        }
    }
}
