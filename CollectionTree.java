
import java.util.TreeSet;

public class CollectionTree {
    public static void main(String[] args) {
        //BinarySearchtree data Stucture 
        TreeSet q1 = new TreeSet();
        q1.add(10);
        q1.add(30);
        q1.add(20);
        q1.add(80);
        System.out.println(q1);
        System.out.println(q1.ceiling(20));
        System.out.println(q1.floor(20));
        System.out.println(q1.higher(20));
        System.out.println(q1.lower(20));
        System.out.println("******************************************");
        System.out.println(q1.ceiling(15));
        System.out.println(q1.floor(15));
        System.out.println(q1.higher(15));
        System.out.println(q1.lower(15));
        

    }
}
