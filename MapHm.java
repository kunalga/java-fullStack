
import java.util.HashMap;
import java.util.LinkedHashMap;


public class MapHm {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(12, "kunal");
        hm.put(10, "john");
        hm.put(15, "doe");
        System.out.println(hm);

        LinkedHashMap hm2 = new LinkedHashMap();
        hm2.put(12, "kunal");
        hm2.put(10, "john");
        hm2.put(15, "doe");
        System.out.println(hm2);

    }
}
