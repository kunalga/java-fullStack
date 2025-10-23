import java.util.*;

public class LinkedListFullDemo {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // 1️⃣ Add elements
        list.add("Kunal");
        list.add("Vishvabharti");
        list.add("College");
        System.out.println("After add(): " + list);

        // 2️⃣ Add at specific index
        list.add(1, "SRM");
        System.out.println("After add(index, e): " + list);

        // 3️⃣ Add First and Last
        list.addFirst("Java");
        list.addLast("Programming");
        System.out.println("After addFirst & addLast: " + list);

        // 4️⃣ Get elements
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // 5️⃣ Set element
        list.set(3, "LinkedList");
        System.out.println("After set(): " + list);

        // 6️⃣ Remove elements
        list.remove(); // Removes first element
        list.remove("SRM");
        list.remove(2);
        System.out.println("After remove(): " + list);

        // 7️⃣ Remove First/Last
        list.removeFirst();
        list.removeLast();
        System.out.println("After removeFirst & removeLast: " + list);

        // 8️⃣ Add again for next methods
        list.add("Cloud");
        list.add("Computing");
        list.add("Kunal");
        list.add("Java");
        System.out.println("List again: " + list);

        // 9️⃣ Peek methods (does not remove)
        System.out.println("peek(): " + list.peek());
        System.out.println("peekFirst(): " + list.peekFirst());
        System.out.println("peekLast(): " + list.peekLast());

        // 🔟 Poll methods (removes)
        System.out.println("poll(): " + list.poll());
        System.out.println("pollFirst(): " + list.pollFirst());
        System.out.println("pollLast(): " + list.pollLast());
        System.out.println("After poll(): " + list);

        // 1️⃣1️⃣ Offer methods (add elements like Queue)
        list.offer("Machine");
        list.offerFirst("AI");
        list.offerLast("Learning");
        System.out.println("After offer(): " + list);

        // 1️⃣2️⃣ contains(), size(), isEmpty()
        System.out.println("Contains 'AI'? " + list.contains("AI"));
        System.out.println("Size: " + list.size());
        System.out.println("IsEmpty: " + list.isEmpty());

        // 1️⃣3️⃣ Iterate
        System.out.print("For-each: ");
        for (String s : list) System.out.print(s + " ");
        System.out.println();

        System.out.print("Iterator: ");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();

        System.out.print("ListIterator Reverse: ");
        ListIterator<String> lit = list.listIterator(list.size());
        while (lit.hasPrevious()) System.out.print(lit.previous() + " ");
        System.out.println();

        // 1️⃣4️⃣ Clear list
        list.clear();
        System.out.println("After clear(): " + list);
    }
}
