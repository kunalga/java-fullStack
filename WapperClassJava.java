public class WapperClassJava {
    public static void main(String[] args) {
        // Wrapper class: Integer, Double, Character, Boolean
        int a = 10;
        // Boxing  Primitive to Object
        Integer i = Integer.valueOf(a); 
        // Unboxing wrapper Object to Primitive
        System.out.println("Value of i: " + i);
        int b = i.intValue(); 
        System.out.println("Value of b: " + b);
        //String to Integer
        String str = "123";
        int c = Integer.parseInt(str);
        System.out.println("Value of c: " + c);
        //Integer to String
        String str2 = Integer.toString(c);
        System.out.println("Value of str2: " + str2);
        //Summary of Wrapper class
        System.err.println("String to Integer use parseXXX() method");
        System.err.println("Integer to String use toString() method");
        System.err.println("Integer to int use intValue() method");
        System.err.println("int to Integer use valueOf() method");
        System.err.println("Summary of Wrapper class");
        Integer obj = 10; // Auto Boxing
        Integer x = 10; // Auto Unboxing
        System.err.println("Buffer of Integer class is -128 to 127");

        System.out.println(obj == x);

        System.out.println(obj.equals(x));
        System.out.println(obj.hashCode());
        System.out.println(x.hashCode());
        Integer m = 128; // Auto Boxing
        Integer n = 128; // Auto Unboxing
        System.out.println(m == n);
        System.out.println(m.equals(n));
        

    }

}
