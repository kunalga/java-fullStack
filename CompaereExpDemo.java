import java.util.Comparator;
import java.util.TreeSet;

class CompareHeven implements Comparator<Integer> {

    @Override
    public int compare(Integer i1, Integer i2) {
        System.out.println("Comparing " + i1 + " and " + i2);
        if (i1 % 2 == 0 && i2 % 2 != 0) {
            return -1; // Even numbers come before odd numbers
        } else if (i1 % 2 != 0 && i2 % 2 == 0) {
            return 1; // Odd numbers come after even numbers
        } else {
            return i1 - i2; // Natural order for same parity
        }
    }

    
}

public class CompaereExpDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(new CompareHeven());
        set.add(10);
        set.add(3);
        set.add(4);

        set.add(7);
        System.err.println("Custom TreeSet with even numbers first: " + set);
    }
}
