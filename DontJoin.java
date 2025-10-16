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
        }
    }
}

public class DontJoin {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();

        synchronized (b) {

            System.out.println("Main thread calling wait() method");
            try {
                System.out.println("No Active Thread :" + Thread.activeCount());
                b.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Main thread got notification call");
            System.out.println("No Active Thread :" + Thread.activeCount());

            System.out.println("Total is: " + b.total);
        }
    }
}
