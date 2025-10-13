class A {}
class B extends A {}

public class InstanceOfJava {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.println(A.class.isInstance(a)); // true
        System.out.println(A.class.isInstance(b)); // true
        System.out.println(B.class.isInstance(a)); // false
        System.out.println(Object.class.isInstance(b)); // true
        System.out.println(A.class.isInstance(null)); // false
    }
}
