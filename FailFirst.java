import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFirst {
    public static void main(String[] args) {
        CopyOnWriteArrayList cal = new CopyOnWriteArrayList<>();
        cal.add(100);
        cal.add(200);
        cal.add(300);
        cal.add(400);
        Iterator itr = cal.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            cal.add(100);
        }
    }
}
