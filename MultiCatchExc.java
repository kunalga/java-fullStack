public class MultiCatchExc {
    public static void main(String[] args) {
        try {
            int arr[] = new int[3];
            arr[5] = 10; // throws ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of range!");
        } catch (Exception e) {
            System.out.println("Some other error occurred!");
        }
    }
}