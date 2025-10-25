import java.util.Comparator;
import java.util.TreeSet;

class StringCompare implements Comparator {
    @Override
    public int compare(Object sb1, Object sb2) {
        String str1 = sb1.toString();
        String str2 = sb2.toString();
        int i1 = str1.length();
        int i2 = str2.length();
        if (i1 < i2)
            return -1;
        else if (i1 > i2)
            return 1;
        else
            return str1.compareTo(str2);
    }
}
public class StringBufferCompare {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new StringCompare());
        treeSet.add(new StringBuffer("AAA"));
        treeSet.add(new StringBuffer("XX"));
        treeSet.add(new StringBuffer("AA"));
        treeSet.add(new StringBuffer("Z"));

        System.out.println("TreeSet elements in sorted order: " + treeSet);

    }
}
