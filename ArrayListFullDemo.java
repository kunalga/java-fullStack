import java.util.*;   // Import all utility classes

public class ArrayListFullDemo {
    public static void main(String[] args) {
        // 🔹 Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // 1️⃣ add(E e) → Add elements
        list.add("Kunal");
        list.add("Vishvabharti");
        list.add("College");
        list.add("Java");
        list.add("Collection");
        System.out.println("After add(): " + list);  

        // 2️⃣ add(int index, E element) → Add at specific position
        list.add(2, "SRM");
        System.out.println("After add(index, element): " + list);

        // 3️⃣ get(int index) → Get element by index
        System.out.println("Element at index 1: " + list.get(1));

        // 4️⃣ set(int index, E element) → Replace element
        list.set(3, "Programming");
        System.out.println("After set(): " + list);

        // 5️⃣ remove(int index) → Remove by index
        list.remove(4);
        System.out.println("After remove(index): " + list);

        // 6️⃣ remove(Object o) → Remove by value
        list.remove("College");
        System.out.println("After remove(Object): " + list);

        // 7️⃣ contains(Object o) → Check if exists
        System.out.println("Contains 'Kunal'? " + list.contains("Kunal"));
        System.out.println("Contains 'Python'? " + list.contains("Python"));

        // 8️⃣ size() → Get total number of elements
        System.out.println("Size of list: " + list.size());

        // 9️⃣ isEmpty() → Check if list is empty
        System.out.println("Is list empty? " + list.isEmpty());

        // 🔹  Add few more elements for demo
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        // 🔟 indexOf(Object o) → Get first index of element
        System.out.println("Index of 'Python': " + list.indexOf("Python"));

        // 1️⃣1️⃣ lastIndexOf(Object o) → Get last index
        list.add("Kunal"); // Duplicate
        System.out.println("Last index of 'Kunal': " + list.lastIndexOf("Kunal"));

        // 1️⃣2️⃣ subList(fromIndex, toIndex) → Get portion of list
        List<String> sub = list.subList(1, 4);
        System.out.println("SubList (1 to 3): " + sub);

        // 1️⃣3️⃣ clone() → Copy list
        ArrayList<String> copy = (ArrayList<String>) list.clone();
        System.out.println("Cloned List: " + copy);

        // 1️⃣4️⃣ ensureCapacity(int minCapacity) → Ensure internal capacity
        list.ensureCapacity(20); // Not visible, internal optimization
        System.out.println("ensureCapacity(20) called.");

        // 1️⃣5️⃣ trimToSize() → Trim unused memory
        list.trimToSize();
        System.out.println("trimToSize() called.");

        // 1️⃣6️⃣ toArray() → Convert to normal array
        Object[] arr = list.toArray();
        System.out.println("Converted to Array: " + Arrays.toString(arr));

        // 1️⃣7️⃣ clear() → Remove all elements
        ArrayList<String> temp = new ArrayList<>(list);
        temp.clear();
        System.out.println("After clear(): " + temp);

        // 1️⃣8️⃣ forEach loop → Iterate
        System.out.print("Using for-each: ");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 1️⃣9️⃣ Iterator → Iterate using Iterator
        System.out.print("Using Iterator: ");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 2️⃣0️⃣ ListIterator → Bidirectional iteration
        System.out.print("Using ListIterator (reverse): ");
        ListIterator<String> lit = list.listIterator(list.size());
        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }
        System.out.println();

        // 2️⃣1️⃣ Sorting
        Collections.sort(list);
        System.out.println("Sorted list (A–Z): " + list);

        // 2️⃣2️⃣ Sorting reverse
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted list (Z–A): " + list);

        // 2️⃣3️⃣ retainAll(Collection c) → Keep only common elements
        ArrayList<String> other = new ArrayList<>(Arrays.asList("Java", "C++", "AI"));
        list.retainAll(other);
        System.out.println("After retainAll(): " + list);

        // 2️⃣4️⃣ addAll(Collection c) → Add all from another list
        list.addAll(Arrays.asList("Python", "HTML", "CSS"));
        System.out.println("After addAll(): " + list);

        // 2️⃣5️⃣ removeAll(Collection c) → Remove all from another list
        list.removeAll(Arrays.asList("HTML", "CSS"));
        System.out.println("After removeAll(): " + list);

        // 2️⃣6️⃣ equals(Object o) → Compare lists
        ArrayList<String> same = new ArrayList<>(list);
        System.out.println("Equal to 'same' list? " + list.equals(same));

        // 2️⃣7️⃣ stream() → Use Stream API
        System.out.print("Using Stream (Uppercase): ");
        list.stream().map(String::toUpperCase).forEach(s -> System.out.print(s + " "));
        System.out.println();

        System.out.println("\n✅ All ArrayList methods demonstrated successfully!");
    }
}
