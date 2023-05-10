// Card class represents a playing card

public class Card {
    private final String face; // face of card {"Ace", "Duece", ....}
    private final String suit; // suit of card {"Hearts,", "Diamonds", ....}

    // two argument constructor initualizes card's face and suit
    public Card(String cardFace, String cardSuit) {
        this.face = cardFace; // init face of card
        this.suit = cardSuit; // init suit of card
    }
    public String getFace() {
        return face;
    }
    public String getSuit() {
        return suit;
    }
    // return String representation of Card
    public String toString() {
        return face + " of " + suit;
    }
}
