class LoveThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Nobody loves me " + i);
        }
    }
}
public class ThreadIsInLife {
    public static void main(String[] args) {
        LoveThread thread = new LoveThread();
        thread.start();
        try {
            Thread.sleep(1000);
            for (int i = 0; i < 10; i++) {
                System.out.println("But I love her " + i);
            }
        } catch (InterruptedException e) {
            System.out.println("Love interrupted");
        }
    }
}
