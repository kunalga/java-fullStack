class MutiThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running");
        for (int i = 0; i < 5; i++) {
            run(i);
        }
    }
    public void run(int a) {
        System.out.println("Thread is running " + a);
    }
}

public class MutiTheradDemo {
    public static void main(String[] args) {
        MutiThread t1 = new MutiThread();
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread is running " + i);
        }
        
        
    }
}
