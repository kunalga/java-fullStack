class MoneyHeist  extends Exception{
    MoneyHeist(String s){
        super(s);
    }
} 
class UserInfo{
    int userId = 101;
    int pin = 1234;
    void checkInfo(int userId, int pin) throws MoneyHeist{
        if(this.userId != userId || this.pin != pin){
            throw new MoneyHeist("Please Take Care! Money Heist is on the way. your card is blocked.");
        }else{
            System.out.println("Welcome to the bank!");
        }
    }
}
public class IAmPlaning {
    public static void main(String[] args) {
        System.out.println("I am planning to start a bank!");
        UserInfo u = new UserInfo();
        try{
            u.checkInfo(101, 123);
        }catch(MoneyHeist e){
            System.out.println(e.getMessage());
            System.out.println("Please try again.");
        }finally{
            System.out.println("Thank you for using our services.");
        }


        
    }
}
