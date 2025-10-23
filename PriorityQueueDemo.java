import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        // 1️⃣ Create a PriorityQueue of Integers (Min-Heap)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(50);
        pq.add(20);
        pq.add(40);
        pq.add(10);
        pq.add(30);

        System.out.println("PriorityQueue: " + pq);

        // 2️⃣ Peek and Element
        System.out.println("peek(): " + pq.peek());     // 10
        System.out.println("element(): " + pq.element()); // 10

        // 3️⃣ Poll elements (removes in priority order)
        System.out.println("poll(): " + pq.poll()); // 10
        System.out.println("poll(): " + pq.poll()); // 20
        System.out.println("After poll(): " + pq);

        // 4️⃣ Offer elements
        pq.offer(15);
        pq.offer(5);
        System.out.println("After offer(): " + pq);

        // 5️⃣ Size and isEmpty
        System.out.println("Size: " + pq.size());
        System.out.println("IsEmpty: " + pq.isEmpty());

        // 6️⃣ Custom Comparator — Max-Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(Arrays.asList(50, 20, 40, 10, 30));
        System.out.println("MaxHeap PriorityQueue: " + maxHeap);
        System.out.println("poll(): " + maxHeap.poll()); // 50

        // 7️⃣ Clear
        pq.clear();
        System.out.println("After clear(): " + pq);
    }
}
