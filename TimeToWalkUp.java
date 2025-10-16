class FailThread extends Thread{

    static Thread mt;

    public void run() {
        try{
            
            mt.join();
            System.out.println("I Am Successful Thread");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class TimeToWalkUp {
    public static void main(String[] args) {
        FailThread ft = new FailThread();
        ft.start();
        FailThread.mt = Thread.currentThread();
        for(int i=0; i<5; i++){
            System.out.println("I Am Try Hard: "+i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        
    }
}
