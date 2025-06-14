import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] numbers = {11, 27, 3, 4, 5};
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        Arrays.sort(numbers);
        System.out.println("Sorted array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        Arrays.fill(numbers, 0);
        System.out.println("Array after filling with 0:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
