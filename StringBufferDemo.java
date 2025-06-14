public class StringBufferDemo {
    public static void main(String[] args) {
        /* 
        // Create a StringBuffer with initial content
        StringBuffer sb = new StringBuffer("kunal Garg");

        // 1. length(): Number of characters currently in the buffer
        System.out.println("Length: " + sb.length()); // Output: 10

        // 2. capacity(): Total storage available (initial = length + 16)
        System.out.println("Capacity: " + sb.capacity()); // Output: 26

        // 3. charAt(int index): Get character at a specific index
        System.out.println("Character at index 2: " + sb.charAt(2)); // Output: 'n'

        // 4. setCharAt(int index, char ch): Change character at index
        sb.setCharAt(0, 'K'); // Change 'k' to 'K'
        System.out.println("After setCharAt: " + sb); // Output: "Kunal"

        // Optional: Showing what happens when appending beyond capacity
        sb.append(" Tendulker Sachin csoafja af  fewjgwekgjwe   "); // Total length now > 21
                sb.append(" Tendulker   "); // Total length now > 21

        System.out.println("After append: " + sb);
        System.out.println("New Length: " + sb.length());
        System.out.println("New Capacity: " + sb.capacity()); // Will grow automatically
        */
         // Create StringBuffer with initial content
        StringBuffer sb = new StringBuffer("Kunal");

        // 1. append(): Add at the end
        sb.append(" Garg");
        System.out.println("After append: " + sb); // Kunal Garg
        sb.insert(0, "Dr. ");
        System.out.println("After insert: " + sb); // Dr. Kunal Garg
        
        // 3. delete(): Delete from index 6 to 10 (exclusive)
        sb.delete(4, 10);
        System.out.println("After delete: " + sb); // Dr. Kunal
        // 4. reverse(): Reverse the content
         // 5. reverse(): Reverses the content
        sb.reverse();
        System.out.println("After reverse: " + sb); // ramuKlanuK
        System.out.println("Final StringBuffer: " + sb);
         sb.setLength(2);
        System.out.println("After setLength(5): " + sb); // 
        System.out.println("Final Length: " + sb.length()); // Output: 2
        System.out.println("Final Capacity: " + sb.capacity()); // Output: 26 (or more, depending on previous operations)
        sb.append(" Garg");
        System.out.println("After append: " + sb); // ramuKlanuK Garg
                sb.trimToSize();
        System.out.println("After trimToSize: " + sb);
        
        // 9. Capacity: Check current buffer size
        System.out.println("Current capacity: " + sb.capacity());
        // 8. ensureCapacity(): Make sure buffer can hold at least 50 characters
        //sb.ensureCapacity(50);
        System.out.println("After ensureCapacity(50), Capacity: " + sb.capacity());
        sb.ensureCapacity(200);
        System.out.println("After ensureCapacity(2), Capacity: " + sb.capacity());
        System.out.println("Final StringBuffer: " + sb); // Final content of the StringBuffer
        sb.trimToSize();
        System.out.println("After trimToSize: " + sb.capacity()); // Final content of the StringBuffer after trimming
        System.out.println("Final Length: " + sb.length()); // Final length of the StringBuffer 




    }
}
