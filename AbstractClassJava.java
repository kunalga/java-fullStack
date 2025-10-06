abstract class Shape {
    void message() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class AbstractClassJava {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.message();  // inherited method
        c.draw();     // own method
    }
}
