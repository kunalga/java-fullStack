import java.util.*;
class Gusser{
    int gusserNo;
    Gusser() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10) + 1;
        System.out.println("Guess a number between 1 and 10:");
        this.gusserNo = randomNumber;
    }
}
class Player{
    int playerNo;
    Player() {
        System.out.print("Enter your guessed number (1-10):");
        Scanner scanner = new Scanner(System.in);
        this.playerNo = scanner.nextInt();
    }
}
class Umpire{
    int numberOfPlayer1;
    int numberOfPlayer2;
    int numberOfGussers;
    void collectNumGussers() {
        Gusser gusser = new Gusser();
        numberOfGussers = gusser.gusserNo;
    }
    void collectNumPlayers() {
        Player player1 = new Player();
        Player player2 = new Player();
        numberOfPlayer1 = player1.playerNo;
        numberOfPlayer2 = player2.playerNo;
    }
    void compare(){
        if (numberOfPlayer1 == numberOfGussers){
            System.out.println("Player 1 wins!");
        } else if (numberOfPlayer2 == numberOfGussers) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("No winner, try again!");    
        }
    }
}
public class Games {
    public static void main(String[] args) {

        Umpire umpire = new Umpire();
        umpire.collectNumGussers();
        umpire.collectNumPlayers();
        umpire.compare();
        System.out.println("Game Over!");
        System.out.println("Gusser's number was: " + umpire.numberOfGussers);
        System.out.println("Player 1 guessed: " + umpire.numberOfPlayer1);
        System.out.println("Player 2 guessed: " + umpire.numberOfPlayer2);
    }

}
