public class LogicalCode {
    public static void main(String[] args) {
        int a = 5;
        if(a == 5 || ++a  ==6) {
            System.out.println("a is equal to 5");
            System.out.println("a is now: " + a);
        } else {
            System.out.println("a is not equal to 5");
        }
    }
}
