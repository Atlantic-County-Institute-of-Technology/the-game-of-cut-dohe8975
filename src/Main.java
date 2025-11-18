import java.util.*;

public class Main {

    public static void main(String[] args) {
        boolean gameRun = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("The game of cut");
        Deck myDeck = new Deck();
        myDeck.newDeck();
        myDeck.shuffle();
        System.out.println(myDeck.deck[7]);

        while (gameRun) {
            int playerWins = 0;
            int cpuWins = 0;
            int playerInput = 0;
            while (playerWins < 3 & cpuWins < 3) {
                System.out.println("pick a number 1-51:");
                playerWins += 1;
                System.out.print(playerWins);
                if (playerWins == 3) {
                    gameRun = false;
                }
            }
        }
        System.out.println("End game");
    }
}
