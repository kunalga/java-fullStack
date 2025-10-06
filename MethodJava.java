class Calculator {
    int a, b;
    int add() {
        a = 10;
        b = 5;
        return a + b;
    }
    int add(float  x, int y) {
        return (int) (x + y);
    }
    int add(int x, int  y) {
        return (int) (x + y);
    }

}
public class MethodJava {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition: " + calc.add(10,1));


    }
}
