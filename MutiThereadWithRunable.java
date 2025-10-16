class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running");
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is running " + i);
        }
    }

  }

public class MutiThereadWithRunable {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        // Create a thread with the Runnable instance
        Thread t1 = new Thread(myRunnable); 
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread is running " + i);
        }
    }
}