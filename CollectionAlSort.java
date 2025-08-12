
import java.util.ArrayList;
import java.util.Collections;

public class CollectionAlSort{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(125);
        System.err.println(al);
        Collections.sort(al);
        System.err.println(al);
        ArrayList al2 = new ArrayList();
        al2.add("neelam");
        al2.add("kunal");

        System.err.println(al2);

        Collections.sort(al2);
        System.err.println(al2);

        System.out.println("Binary Search using Collections ");
        ArrayList al4 = new ArrayList();
        al4.add(10);
        al4.add(20);
        al4.add(30);
        al4.add(70);
        int a =Collections.binarySearch(al4, 30);
        System.err.println("Index: "+ a);
        Collections.shuffle(al4);
        System.out.println(al4);
        System.err.println(Collections.frequency(al4, 30));

    



 
    }
    
}