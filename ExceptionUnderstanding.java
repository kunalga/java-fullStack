class OneDayIGoToException{
    void method(){
        System.out.println("I go to Exception");
    }

}
public class ExceptionUnderstanding {
    public static void main(String[] args) throws Exception {
        //OneDayIGoToException obj = new OneDayIGoToException();
        //obj.method();
        //System.out.println("I am back from Exception");
        Class obj = Class.forName(args[0]);
        Object obj1 = obj.newInstance();
        System.out.println(obj1);
        System.out.println("I am back from Exception");
        ((OneDayIGoToException)obj1).method();
    }
}
        
    

