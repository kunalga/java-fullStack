import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Kunal");
        list.add("Vishvabharti");
        list.add("College");
        list.add("Java");

        // Create Iterator
        Iterator<String> it = list.iterator();

        System.out.println("Using Iterator:");
        while (it.hasNext()) {
            String element = it.next();
            System.out.println(element);

            // Remove element "College" during iteration
            if (element.equals("College")) {
                it.remove();
            }
        }

        System.out.println("After removing 'College': " + list);
        ListIterator<String> lit = list.listIterator();

// Forward iteration
        System.out.println("Using ListIterator (forward):");
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }

        // Backward iteration
        ListIterator<String> lits = list.listIterator(list.size());

        System.out.println("Using ListIterator (backward):");
        while (lits.hasPrevious()) {
            System.out.println(lits.previous());
        }


    }
}
