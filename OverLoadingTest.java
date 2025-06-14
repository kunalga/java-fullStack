class Test {
    public void test(int a) {
        System.out.println("int");
    }

    public float test(int a, int b) {
        System.out.println("int, int");
        return a + b;
    }

    public float test(float a,int b) {
        return a + b;
    }


}
public class OverLoadingTest {
    public static void main(String[] args) {
        Test t = new Test();
        t.test(10);
        t.test(10.0f, 20);
        t.test(10, 20);
    }
}