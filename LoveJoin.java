class MyLoveThread extends Thread {
    @Override
    @SuppressWarnings("CallToPrintStackTrace")
    public void run()  {
        for (int i = 0; i < 10; i++) {
            System.out.println("My Feeling good alone");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class LoveJoin {
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        MyLoveThread noWait = new MyLoveThread();
        noWait.start();
        try {
            noWait.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Love My Self Only.");
    }

}



