public class StringJava {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String str1 = "Hello, World!";
        String str2 = new String("Hello, World!");
        System.out.println(str.concat(" Welcome to Java."));
        System.out.println(str.equals(str1));
        System.out.println(str.length());
        System.out.println(str == str1);
        System.out.println(str == str2);
        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder sb1 = new StringBuilder("Hello");
        System.out.println(sb.equals(sb1));
        System.out.println(sb==sb1);
         

    }
}
