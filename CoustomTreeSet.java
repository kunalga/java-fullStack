class MyComparator implements java.util.Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        System.out.println("Comparing " + o1 + " and " + o2);
        return o2 - o1; // Descending order
    }
}

public class CoustomTreeSet {
    public static void main(String[] args) {
        java.util.TreeSet<Integer> customSet = new java.util.TreeSet<>(new MyComparator());
        customSet.add(10);
        customSet.add(5);
        customSet.add(20);
        customSet.add(15);
        customSet.add(30);
        customSet.add(25);
        customSet.add(35);
        System.out.println("Custom TreeSet elements in descending order: " + customSet);
        
      
    }
}
