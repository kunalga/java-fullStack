public class TypeCastJava {
 
    public static void main(String[] args) {
        int num = 10;
        double d = num;   // int → double (automatic)
        System.out.println(d); // 10.0

        double d2 = 9.78;
        int nums = (int) d2;   // double → int (manual)
        System.out.println(nums); // 9
    }
}


