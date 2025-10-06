public class StringMethed {
    public static void main(String[] args) {
        String s = " Java Programming ";
        String s1 = " JavA Programming ";

        System.out.println(s.length());              // 17
        System.out.println(s.trim());                // "Java Programming"
        System.out.println(s.toUpperCase());         // " JAVA PROGRAMMING "
        System.out.println(s.toLowerCase());         // " java programming "
        System.out.println(s.substring(1,5));        // "Java"
        System.out.println(s.contains("Program"));   // true
        System.out.println(s.indexOf("a"));          // 2
        System.out.println(s.replace("Java","C++")); // " C++ Programming "
        System.out.println(s.charAt(5));            // 'P'
        System.out.println(s.lastIndexOf('a'));     // 15

        String[] parts = s.trim().split(" ");
        for (String part : parts) {
            System.out.println(part);
        }

        System.out.println(s.startsWith(" Java"));       // true
        System.out.println(s.equals(s1));      // true
        System.out.println(s.equalsIgnoreCase(s1)); // true
        
    }
}
