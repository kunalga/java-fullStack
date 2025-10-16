class InterruptionThread extends Thread {
    @Override
    public void run(){
        try {

            for(int i =0;i<5 ;i++){
                System.err.println("No one in Life");
                Thread.sleep(200);
            }
            
        } catch (InterruptedException e) {
            System.out.println("That Means You need to wait ");

        }

        
    }
    


}
public class InterruptionDay {
    public static void main(String[] args) throws InterruptedException{
        InterruptionThread id = new InterruptionThread();
        id.start();
        id.interrupt();

        
    }
}// InterruptionDemo id = new InterruptionDemo(); --- IGNORE ---