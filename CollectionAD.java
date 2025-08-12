import java.util.ArrayDeque;
public class CollectionAD {
    public static void main(String[] args) {
        ArrayDeque pq = new ArrayDeque();
        pq.add("Hello");
        pq.add("World");
        pq.add(42);
        pq.addFirst(12.4);
        pq.addLast(true);
        pq.add(42);
        System.out.println("Deque contents: " + pq);
        System.out.println("Deque after removing first element: " + pq.pollFirst());
        System.out.println("Deque after removing last element: " + pq.pollLast());
        pq.addFirst(10);
        

        System.out.println("Deque after poll: " + pq);
    }
    
}
