public class StringTest {
    public static void main(String[] args) {
        String s1 = "Hello, World!";
        s1 = s1.concat(" How are you?");
        System.out.println(s1); // Output: Hello, World! How are you?
        StringBuilder sb = new StringBuilder("Hello, World!");
        sb.append(" How are you?");
    }
}
