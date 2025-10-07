public class ExceptionHandlingJava {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Oh God I am Exception! what to do !");
        } finally {
            System.out.println("I can't Handle you Exception my Son.I am Done with you Exception! ");
        }
    }
}
