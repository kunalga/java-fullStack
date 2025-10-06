public class OverloadMain {
    static {
        System.out.println("Static block in OverloadMain executed");
    }
    static int count ;
    public static void main(int a, int b) {
        System.out.println("Main with int, int: " + (a + b));
        count++;
    }
    public static void main(double a, double b) {

        System.out.println("Main with double, double: " + (a + b));
            
    }
        public static void main(String[] args, int b) {
            System.out.println("Main with String[], int: " + b);
            
        }
    public static void main(String[] apple) {
        System.out.println("Main with String[]: ");
        main(5, 10);
        main(5.5, 10.5);
        System.out.println("Count of main(int, int) calls: " + count);

    }
}
