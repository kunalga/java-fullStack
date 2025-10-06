class InstanceCounter {

    int count = 0; // Instance variable
    static  int MaxCount = 189; // Static variable
        static {
        System.out.println("Static block in InstanceCounter executed");
    }
    InstanceCounter() {
        count++;
        System.out.println("Instance Count: " + count);
    }
}
public class InstanceVar {
    static {
        System.out.println("Static block executed");
    }
    public static void main(String[] args) {
       System.out.println("MaxCount: " + InstanceCounter.MaxCount); // Accessing static variable
   

    }
}
