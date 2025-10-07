abstract class IAmAnonymousBoy {
    public abstract void display();
}
public class AnonimusClassJava {
    public static void main(String[] args) {
        IAmAnonymousBoy abj = new IAmAnonymousBoy() {
            @Override
            public void display() {
                System.out.println("Hello from Anonymous Class!");
            }
        };
        abj.display();

}
}
