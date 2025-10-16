class myThread extends Thread {
    @Override
    public void run() {

        System.out.println("Thread priority: " + Thread.currentThread().getPriority());
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
public class SetPriorityThread {
    public static void main(String[] args) {
       /*Thread.currentThread().setPriority(Thread.MIN_PRIORITY);*/
       
        System.out.println("Current thread priority: " + Thread.currentThread().getPriority());
        myThread t1 = new myThread();
        t1.start();
        /*t1.setPriority(Thread.MAX_PRIORITY);  */
        Thread.currentThread().yield();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread i = " + i);
        }
       }
    
}
