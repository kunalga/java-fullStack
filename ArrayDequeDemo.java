import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        // 1️⃣ Add elements
        deque.add("Kunal");
        deque.add("Vishvabharti");
        deque.add("College");
        System.out.println("After add(): " + deque);

        // 2️⃣ Add First and Last
        deque.addFirst("Java");
        deque.addLast("Programming");
        System.out.println("After addFirst & addLast: " + deque);

        // 3️⃣ Offer methods (similar to add)
        deque.offer("Cloud");
        deque.offerFirst("AI");
        deque.offerLast("Machine Learning");
        System.out.println("After offer methods: " + deque);

        // 4️⃣ Peek methods (view elements without removing)
        System.out.println("peek(): " + deque.peek());
        System.out.println("peekFirst(): " + deque.peekFirst());
        System.out.println("peekLast(): " + deque.peekLast());

        // 5️⃣ Poll methods (remove and return element)
        System.out.println("poll(): " + deque.poll());
        System.out.println("pollFirst(): " + deque.pollFirst());
        System.out.println("pollLast(): " + deque.pollLast());
        System.out.println("After poll(): " + deque);

        // 6️⃣ Stack operations
        deque.push("Data");
        deque.push("Science");
        System.out.println("After push(): " + deque);

        deque.pop();
        System.out.println("After pop(): " + deque);

        // 7️⃣ Size, Empty, and Clear
        System.out.println("Size: " + deque.size());
        System.out.println("Is Empty? " + deque.isEmpty());

        deque.clear();
        System.out.println("After clear(): " + deque);
    }
}
