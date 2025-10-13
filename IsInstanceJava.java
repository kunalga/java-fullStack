class X {}
class Y extends X {}

public class  IsInstanceJava{
    public static void main(String[] args) throws Exception {
        Object obj = new Y();

        // class name given dynamically (not hardcoded)
        Class<?> cls = Class.forName(args[0]); // e.g. "X" or "Y"
        System.out.println(cls.isInstance(obj)); // ✅ true
    }
}
