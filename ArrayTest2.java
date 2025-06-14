public class ArrayTest2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] num2 = {1, 3, 4};
        num2 = numbers; // This will not copy the array, it will just reference the same array
        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }
    }
}