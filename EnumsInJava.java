enum Result{
    SUCCESS,
    FAILURE,
    PENDING;
    Result(){
        System.out.println("Result enum constructor called");
    }


}
public class EnumsInJava{



    public static void main(String[] args) {
        Result res = Result.SUCCESS;
        System.out.println("Result is: " + res); 
        Result[] resarr = Result.FAILURE.values();
        for(Result r : resarr){
            System.out.println(r.ordinal() + " : " + r.name());
        }
        
    }

   
}