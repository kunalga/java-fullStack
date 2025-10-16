class LoveResponse extends Thread {
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                
                System.out.println(" She is thinking... thinking...");
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}
            System.out.println(" She blocked you everywhere!");
            // No notify() call — main thread waits forever
            this.notify(); // This line is commented out to simulate the failure
        }
    }
}

public class LoveFail {
    public static void main(String[] args) throws InterruptedException {
        LoveResponse her = new LoveResponse();
        her.start();
        Thread.sleep(3000); // ensure her thread starts first

        synchronized (her) {
            System.out.println(" You: Waiting for her reply...");
            her.wait(3000);  // main thread waits forever 
            System.out.println(" You Finally Move On!  :(");
        }
    }
}
