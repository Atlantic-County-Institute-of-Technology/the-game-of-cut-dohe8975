import java.util.*;


public class Main {
    public static void main(String[] args) {
        boolean gameRun = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("The game of cut");
        Deck myDeck = new Deck();
        myDeck.newDeck();
        myDeck.shuffle();

        while (gameRun) {
            int playerWins = 0;
            int cpuWins = 0;
            int playerInput = 0;
            while (playerWins < 3 & cpuWins < 3) {
                myDeck.newDeck();   // populates deck
                myDeck.shuffle();   // shuffles deck
                System.out.println("\npick a number 1-51:");    // ask player for card number
                playerInput = scan.nextInt(); // works to get player input
                System.out.printf("\nYou picked card " + playerInput);
                if(playerInput >= 52) {
                    System.out.println("\nCant pick card 52 or higher, making player card 51");
                    playerInput = 51;
                    System.out.println(playerInput);
                }
                if(playerInput <= 0 ) {
                    System.out.println("\nCant pick card 0 or lower, making player card 1");
                    playerInput = 1;
                    System.out.println(playerInput);
                }


                System.out.printf("\nPlayer Card is " + myDeck.deck[playerInput]);
                System.out.printf("\nCPU Card is " + myDeck.deck[52 - playerInput]); // starts from after the player cut the deck for the cpu card

                Card playerCard = myDeck.deck[playerInput];
                Card cpuCard = myDeck.deck[52 - playerInput];
                // 1System.out.println(playerCard.getFace());
                // System.out.println(cpuCard.getFace());

                if(playerCard.getFace() > cpuCard.getFace()) {
                    System.out.println("\nPlayer Wins This Round!!");
                    playerWins += 1;
                    System.out.printf("Player Wins: " + playerWins + "\nCPU Wins: " + cpuWins);
                }
                if(playerCard.getFace() < cpuCard.getFace()) {
                    System.out.println("\nCPU Wins This Round!!");
                    cpuWins += 1;
                    System.out.printf("Player Wins: " + playerWins + "\nCPU Wins: " + cpuWins);
                }
                if(playerCard.getFace() == cpuCard.getFace()) {
                    if(playerCard.getSuit() > cpuCard.getSuit()) {
                        System.out.println("\nPlayer Wins This Round!!");
                        playerWins += 1;
                    }
                    else if(playerCard.getSuit() < cpuCard.getSuit()) {
                        System.out.println("\nCPU Wins This Round!!");
                        cpuWins += 1;
                    }
                    else {
                        System.out.println("That shouldn't happen...");
                    }
                    System.out.printf("\nPlayer Wins: " + playerWins + "\nCPU Wins: " + cpuWins);
                }
                if (playerWins == 3) {
                    System.out.println("\nPlayer Wins!!");
                    gameRun = false;
                }
                if (cpuWins == 3) {
                    System.out.println("\nCPU Wins!!");
                    gameRun = false;
                }
            }
        }
        System.out.println("\nGame Over");


    }
}
