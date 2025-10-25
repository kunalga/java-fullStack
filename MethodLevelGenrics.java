
import java.util.ArrayList;

public class MethodLevelGenrics {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        m1(intList);
        System.err.println("Integer List: " + intList);
    }

    public static void m1(ArrayList list) {
        list.add("Hello");
        list.add(40);
        list.add(true);


        }

}



