
import java.util.HashSet;
import java.util.LinkedHashSet;


public class CollectionHs {
    public static void main(String[] args) {
        HashSet s1 = new HashSet();
        s1.add(100);
        s1.add(50);
        s1.add(150);
        s1.add(125);
        System.out.println(s1);

        System.out.println("*********");
        LinkedHashSet s2 = new LinkedHashSet();
        s2.add(100);
        s2.add(50);
        s2.add(150);
        s2.add(125);
        System.out.println(s2);

    }
}

