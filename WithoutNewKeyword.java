 class MyClass {
    static {
        System.out.println("MyClass  .class file block executed");
    }
    public MyClass() {
        System.out.println("MyClass constructor called");

    }
    public void display() {
        System.out.println("Hello from MyClass");
    }
}

public class WithoutNewKeyword {
    public static void main(String[] args) throws Exception {
        //Load the class file explicitly
        Class c = Class.forName(args[0]); // 
        //Create an instance of the class
        Object obj = c.newInstance();
        //zero parameter constructor call
        MyClass myClass = (MyClass) obj;
        myClass.display();
        //zero parameter method call

        //myClass.show(); // Uncommenting this line will cause a compile-time error
       


    
    }
}
