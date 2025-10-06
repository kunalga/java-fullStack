class OuterClass {
    private String msg = "Hello from Outer";
    Inner inner = new Inner(); // Create inner class instance

    public void show(){
        inner.show();
    }


    class Inner {
        Inner() {
            System.out.println("Inner class constructor");
        }
        void show() {
            System.out.println(msg); // Can access outer class private member
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.Inner inner = outer.new Inner(); // Create object
        inner.show();
        outer.show();

    }
}