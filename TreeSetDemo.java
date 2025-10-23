import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        // 1️⃣ Add elements
        ts.add(50);
        ts.add(20);
        ts.add(40);
        ts.add(10);
        ts.add(30);
        System.out.println("TreeSet: " + ts);

        // 2️⃣ first() and last()
        System.out.println("First element: " + ts.first());
        System.out.println("Last element: " + ts.last());

        // 3️⃣ higher() and lower()
        System.out.println("Higher than 25: " + ts.higher(25));
        System.out.println("Lower than 25: " + ts.lower(25));

        // 4️⃣ ceiling() and floor()
        System.out.println("Ceiling of 25: " + ts.ceiling(25));
        System.out.println("Floor of 25: " + ts.floor(25));

        // 5️⃣ Remove elements
        ts.remove(40);
        System.out.println("After remove(40): " + ts);

        // 6️⃣ Poll first and last
        System.out.println("pollFirst(): " + ts.pollFirst());
        System.out.println("pollLast(): " + ts.pollLast());
        System.out.println("After polling: " + ts);

        // 7️⃣ Size and isEmpty
        System.out.println("Size: " + ts.size());
        System.out.println("IsEmpty: " + ts.isEmpty());

        // 8️⃣ Iterator
        System.out.print("Iterator (asc): ");
        for (Integer i : ts) System.out.print(i + " ");
        System.out.println();

        System.out.print("Descending Iterator: ");
        Iterator<Integer> desc = ts.descendingIterator();
        while (desc.hasNext()) System.out.print(desc.next() + " ");
        System.out.println();

        // 9️⃣ SubSet, HeadSet, TailSet
        ts.addAll(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("SubSet (15,45): " + ts.subSet(15, 45));
        System.out.println("HeadSet (35): " + ts.headSet(35));
        System.out.println("TailSet (35): " + ts.tailSet(35));

        //  🔟 Clear
        ts.clear();
        System.out.println("After clear(): " + ts);
    }
}
