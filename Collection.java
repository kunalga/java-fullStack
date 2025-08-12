import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.ensureCapacity(3);
        list.add("Hello");
        System.out.println("List after adding 'Hello': " + list.size());

        list.add("World");
        list.add(42);
        list.add(3.14);
        list.add(true);
        list.add(new Object());
        ArrayList intList = new ArrayList();

        intList.add(list);
        System.out.println("List contents: " + intList);
        list.add(0, 44);
        list.add(33);
        System.out.println("List after adding 44 at index 0: " + list);
        list.add(0, 7);
        System.out.println("List after adding 44 at index 0: " + list);
        list.addAll(0, list);
        System.out.println("List after adding all elements at index 0: " + list);
        list.contains(42);
        System.out.println("List contains 42: " + list.contains(42));
        System.out.println("List size: " + list.indexOf(42));
        System.out.println("List size: " + list.size());
        System.out.println("List is empty: " + list.isEmpty());
        System.out.println("capacity: " + list.size());
        list.ensureCapacity(30);
        list.trimToSize();
        System.out.println("capacity after trim: " + list.size());
        list.trimToSize();
        System.out.println("List after trimming to size: " + list);
        System.out.println("List after adding 33 at the end: " + list.add(33));
        System.out.println("List after adding 33 at the end: " + list.getClass());
        list.remove(0);
        System.out.println("List after removing element at index 0: " + list);
        list.remove("World");
        System.out.println("List after removing 'World': " + list);
        list.clear();
        System.out.println("List after clearing: " + list);
        System.out.println("List after clearing: " + list.isEmpty());
        System.out.println("List after clearing: " + list.size());
    }
}
