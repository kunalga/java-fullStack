public class SrtTest1 {

    public static void main(String[] args) {
        /*

        String s1 = "Hello, World!" + "!";
        String s2 = s1 + "!";
        final String s3 = s2 + "!";
        String s4 = s3 + "!";
        */
        /*
        String s1 = "hello";               // literal → SCP
        String s2 = new String("hello");   // new object → Heap
        String sa2 = "hello" + s2; // concatenation → Heap
        String s3 = s2.intern();  
        System.err.println("sa2.intern() = " + sa2.intern());

        System.out.println(s1 == s2); // false (heap ≠ SCP)
        System.out.println(s1 == s3); // true  (both SCP)

        // 1. String literal
        String str1 = "Hello";

        // 2. String object using 'new' with literal
        String str2 = new String("Hello");

        // 3. String object using 'new' with char array
        char[] chars = {'J', 'a', 'v', 'a'};
        String str3 = new String(chars);

        // 4. String object using 'new' with byte array
        byte[] bytes = {65, 66, 67}; // A B C
        String str4 = new String(bytes);

        // 5. Another string literal (same as str1 but reused)
        String str5 = "Hello";

        // 6. StringBuffer object
        StringBuffer sb1 = new StringBuffer("Mutable");

        // 7. Convert StringBuffer to String (valid way)
        String str6 = new String(sb1); // This constructor exists

        // Invalid: Uncommenting the below line will cause a compile-time error
        // String str7 = new StringBuffer(); ❌ ERROR - can't assign StringBuffer directly to String

        // Output
        System.out.println("str1 (literal): " + str1);
        System.out.println("str2 (new String): " + str2);
        System.out.println("str3 (char[]): " + str3);
        System.out.println("str4 (byte[]): " + str4);
        System.out.println("str5 (another literal): " + str5);
        System.out.println("sb1 (StringBuffer): " + sb1);
        System.out.println("str6 (from StringBuffer): " + str6);
        */
         
        String str = " Hello Java,";

        System.out.println("charAt(0): " + str.charAt(0)); // 'H'
        System.out.println("concat: " + str.concat(" Welcome"));
        System.out.println("indexOf('J'): " + str.indexOf('J')); // 6
        System.out.println("substring(7): " + str.substring(6)); // "Java,"
        System.out.println("toUpperCase(): " + str.toUpperCase()); // "HELLO JAVA,"
        System.out.println("trim(): " + str.trim()); // "Hello Java,"
        System.out.println("replace('Java', 'World'): " + str.replace("Java", "World")); // "Hello World,"
        System.out.println(str); // "Hello Java, "
        System.out.println("length(): " + str.length()); // 13
        System.out.println("equals: " + str.equals(" Hello Java! "));
        System.out.println("equalsIgnoreCase: " + str.equalsIgnoreCase(" hello java! "));
        System.out.println("substring(1): " + str.substring(1));
        System.out.println("substring(1, 6): " + str.substring(1, 6));


    }
}

