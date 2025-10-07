interface InterfacePeople {
    void show();
}
public class InterfaceAnonimusJava {
    public static void main(String[] args) {
        @SuppressWarnings("Convert2Lambda")
        InterfacePeople ip = new InterfacePeople() {
            @Override
            public void show() {
                System.out.println("Hello from Anonymous Class implementing Interface!");
            }
        };
        ip.show();
    }
}
