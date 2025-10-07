public class VarArgsJava {
    // Varargs method
    
    static void display(int[] a) {   //int [] a 
        System.out.println("Number of arguments: " + a.length);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void display2(int... a) {
        System.out.println("Number of arguments: " + a.length);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void display(int a) {
        System.out.println("Single argument: " + a);
    }

    public static void main(String[] args) {
        System.out.println("JDK 1.5 introduced Varargs feature SINGLE method can take multiple arguments");
        display(new int[]{}); // No argument
        display(new int[]{10}); // One argument
        display(new int[]{10, 20, 30}); // Multiple arguments
        display(new int[]{1, 2, 3, 4, 5}); // Multiple arguments
        System.out.println("Using Varargs method");
        display2(); // No argument
        display(10); // One argument
        display2(10, 20, 30); // Multiple arguments
        display2(1, 2, 3, 4, 5); // Multiple arguments

    }
}
