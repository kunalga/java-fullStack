class ThreadB extends Thread {
    int total = 0;

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("Child thread starts calculation");
            for (int i = 1; i <= 100; i++) {
                total += i;
            }
            System.out.println("Child thread giving notification call");
            this.notify();
        }
    }
}

public class DontWait {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();

        synchronized (b) {
            System.out.println("Main thread calling wait() method");
            try {
                b.wait(); // main thread waiting for notification
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Main thread got notification call");
            System.out.println("Total is: " + b.total);
        }
    }
}
