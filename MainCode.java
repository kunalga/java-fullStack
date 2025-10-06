public class MainCode {
    public static void main(String[] args) throws NumberFormatException {
        int sum = 0;
        for (String arg : args) {
            int num = Integer.parseInt(arg);
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}
