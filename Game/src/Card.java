import java.util.*;


public class Card {
    public final String[] faces = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    public final String[] suits = {null, "Spades", "Hearts", "Clubs", "Diamonds"};

    private final int face;
    private final int suit;

    public Card(int face, int suit) {
        this.face = face;
        this.suit = suit;
    }

    public int getFace() {
        return face;
    }

    public int getSuit() {
        return suit;
    }

    public String toString() {
        return faces[face] + " of " + suits[suit];
    }

    public static void main(String[] args) {
        Card card1 = new Card(1, 1); System.out.println(card1);
    } }