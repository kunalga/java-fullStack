

public class CollectionLL {
    public static void main(String[] args) {

        java.util.LinkedList list = new java.util.LinkedList();
        list.add("Hello");
        list.add("World");
        list.add("42");
        list.addFirst(12.4);
        list.addLast(true);
        System.out.println("List contents: " + list);
        list.add(0, "New Element");
        System.out.println("List after adding 'New Element' at index 0: " + list);
        list.add(2, "Inserted Element");
        System.out.println("List after inserting 'Inserted Element' at index 2: " + list);
        System.out.println("List contains 'World': " + list.indexOf("World"));
        System.out.println("List first element: " + list.getFirst());
        System.out.println("List last element: " + list.getLast());
        System.out.println("List size: " + list.size());
        System.out.println("List last index of '42': " + list.lastIndexOf("42"));
        System.out.println("*****************************************************************");
        System.out.println("List is empty: " + list);
        System.out.println("List after adding  at the end: " + list.peekFirst());
        System.out.println("List after adding 33 at the end: " + list.peekLast());
        System.out.println("List after adding 33 at the end: " + list.pollFirst());
        System.out.println("List after adding 33 at the end: " + list.pollLast());
        System.out.println("List is poll: " + list.poll());
        System.out.println("List is peek: " + list.peek());
        System.out.println("List after poll: " + list);
    }
}