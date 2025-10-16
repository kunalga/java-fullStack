class mythread extends Thread {
    public void run() {
        System.out.println("Current thread name: " + Thread.currentThread().getName());
    }
}
public class ThreadName {
    public static void main(String[] args) {
        Thread.currentThread().setName("Food Eater");
        System.out.println("Current thread name: " + Thread.currentThread().getName());
        //System.out.println(12/0);
        mythread t1 = new mythread();
        t1.start();
        mythread t2 = new mythread();
        t2.start();

    }

}

