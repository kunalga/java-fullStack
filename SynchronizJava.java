

class Display {
    @SuppressWarnings("CallToPrintStackTrace")
    public static synchronized void wish(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Best Cricketing Legend: ");
            System.out.println(name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Sleep after printing all messages
    }
}
class MyThread extends Thread {
    Display d;
    String name;

    MyThread(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}

public class SynchronizJava {
    public static void main(String[] args) {
        Display d = new Display();
        Display d1 = new Display();
        MyThread t1 = new MyThread(d, "Dhoni");
        MyThread t2 = new MyThread(d1, "Yuvaraj");
        t1.start();
        t2.start();


        
    }
}