class MyThread extends Thread {
    public void run() {
        System.out.println("Child thread running...");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
        System.out.println("Child thread exiting...");
    }
}

public class Test {
    public static void main(String[] args) {
        // Print if main thread is daemon or not
        System.out.println("Main thread daemon? " + Thread.currentThread().isDaemon());

        // Create child thread
        MyThread t1 = new MyThread();

        // Set as daemon BEFORE starting
        t1.setDaemon(true);

        // Start thread
        t1.start();

        // Check daemon status
        System.out.println("Child thread daemon? " + t1.isDaemon());

        System.out.println("Main thread ending...");
    }
}
