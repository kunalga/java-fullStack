@FunctionalInterface
interface MyFunctionalInterface {
    void display();
}
public class LambdaExprasionJava {
    public static void main(String[] args) {
        // Using a lambda expression
        MyFunctionalInterface myFun = () -> System.out.println("Hello from Lambda Expression!");
        myFun.display();
    }
}
