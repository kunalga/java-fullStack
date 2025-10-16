class Display1 {
    // Method to display numbers from 1 to 10
    public synchronized  void displayNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(2000); // Pause for 2 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    // Method to display characters from A to K
    public synchronized void displayCharacters() {
        for (int i = 65; i <= 75; i++) { // ASCII 65-75 → A-K
            System.out.print((char) i + " ");
            try {
                Thread.sleep(2000); // Pause for 2 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
// Thread class for displaying numbers
class MyThread1 extends Thread {
    Display1 d;

    MyThread1(Display1 d) {
        this.d = d;
    }

    @Override
    public void run() {
        d.displayNumbers();
    }
}

// Thread class for displaying characters
class MyThread2 extends Thread {
    Display1 d;

    MyThread2(Display1 d) {
        this.d = d;
    }

    public void run() {
        d.displayCharacters();
    }
}

// Main class to test Display
public class ChildLockJava {
    public static void main(String[] args) {
        Display1 d = new Display1();
        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);
        t1.start();
        t2.start();
    }
}
