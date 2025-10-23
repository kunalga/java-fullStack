import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // Create LinkedHashSet
        LinkedHashSet<String> subjects = new LinkedHashSet<>();

        // Add elements
        subjects.add("Math");
        subjects.add("Science");
        subjects.add("English");
        subjects.add("Computer");
        subjects.add("Math"); // Duplicate — will be ignored

        // Display elements
        System.out.println("Subjects: " + subjects);

        // Check if element exists
        System.out.println("Contains 'Science'? " + subjects.contains("Science"));

        // Remove an element
        subjects.remove("English");

        // Iterate through LinkedHashSet
        System.out.println("After removal:");
        for (String s : subjects) {
            System.out.println(s);
        }
    }
}
 
