// Class that performs a synchronized operation
class Display {
    public void wish(String name) {
        // Imagine there are 1 lakh lines of code before synchronization
        // that do not need synchronization
        // ;;;;;;;;;;;;;;;; // 1-lakh lines of code (for illustration)

        synchronized (Display.class) { // synchronized block ensures only one thread executes this at a time
            for (int i = 1; i <= 10; i++) {
                System.out.print("Good Morning: ");
                try {
                    Thread.sleep(2000); // pause for 2 seconds
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println(name);
            }
        }
        System.out.println("-------------------");

        // 1-lakh more lines of code after synchronized block
        // ;;;;;;;;;;;;;;;; // 1-lakh lines of code
    }
}

// Thread class 1
class MyThread1 extends Thread {
    Display d;
    String name;

    MyThread1(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.wish(name);
    }
}

// Thread class 2
class MyThread2 extends Thread {
    Display d;
    String name;

    MyThread2(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.wish(name);
    }
}

// Main class
public class SyncDemo {
    public static void main(String[] args) {
        Display obj = new Display();
        Display obj1 = new Display();

        MyThread1 t1 = new MyThread1(obj, "Kunal");
        MyThread2 t2 = new MyThread2(obj1, "Garg");

        t1.start();
        t2.start();
    }
}
