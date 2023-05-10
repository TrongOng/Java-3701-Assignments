// DeckOfCards class represents a deck of playing cards
import java.security.SecureRandom;

public class DeckOfCards {
    // radnom number generator
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final int NUMBER_OF_CARDS = 52; // constant number of cards

    private Card[] deck = new Card[NUMBER_OF_CARDS]; // Card references
    private int currentCard = 0; // index of next card to be dealt (0-51)


    // constructor fills deck of cards
    public DeckOfCards() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
        "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // populate deck with Card objects
        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count%13], suits[count/13]);
        }
    }

    // shuffle deck of Cards with one-pass algorithm
    public void shuffle() {
        // next call to method dealCard should start at deck[0] again
        currentCard = 0;
        
        // for each Card, pick another random card (0-51) and swap them
        for (int first = 0; first < deck.length; first++) {
            // seelct a random number bwtween 0 and 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            // swap current Card with randomly selected Card
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }
    public Card dealCard() {
        // determine whether Cards remain to be dealt
        if (currentCard < 5) {
            return deck[currentCard++]; // return current Card in array
        }
        else {
            return null; // return null to indicate that all cards were dealt
        }
    }
    public void combination() {
        int[] numberFace = new int[15];
        int[] numberSuit = new int[5];

        int pair = 0;
        int twoPair = 0;
        int threeOfKind = 0;
        int straight = 0;
        int flush = 0;
        int fullHouse = 0;
        int fourOfKind = 0;

        for (int i = 0; i < 14; i++) { //loop score
            if (numberFace[i] == 2 || numberFace[i] == 3) {
                for (int j = i; j < 14; j++) {
                    if ((numberFace[i] == 2 && numberFace[j+1] == 3) || (numberFace[i] == 3 && numberFace[j+1] == 2)) {
                        //System.out.println("Full House");
                        fullHouse=+1;
                    }
                    else if ((numberFace[i] == 2 && numberFace[j+1] == 2)) {
                        //System.out.println("Is Two Pair");
                        twoPair=+1;
                    }
                    else if ((numberFace[i] == 2 && numberFace[j+1] == 0)) {
                        //System.out.println("Is Pair");
                        pair=+1;
                    }
                    else if ((numberFace[i] == 3 && numberFace[j+1] == 0)) {
                        //System.out.println("Is Three of Kind");
                        threeOfKind=+1;
                    }
                }
            }
            if (numberFace[i] == 4) {
                //System.out.println("Is Four of a Kind");
                fourOfKind=+1;
            }
            if(numberFace[i] == 1 && numberFace[i+1] == 1 && numberFace[i+2] == 1 && numberFace[i+3] == 1 && numberFace[i+4] == 1) {
                //System.out.println("Straight");
                straight=+1;
            }
        }
        for (int i = 0; i < 5; i++) {
            if (numberSuit[i] == 5) {
                //System.out.println("Flush");
                flush=+1;

            }
        }

        // Compare Which is Better Combination Hands
        if (pair > 0 && twoPair == 0 && threeOfKind == 0 && straight == 0 && flush == 0 && fullHouse == 0 && fourOfKind == 0) {
            System.out.println("Pair : Highest");
        }
        else if (pair > 0 && twoPair > 0 && threeOfKind == 0 && straight == 0 && flush == 0 && fullHouse == 0 && fourOfKind == 0) {
            System.out.println("Two Pair : Highest");
        }
        else if (pair == 0 && twoPair == 0 && threeOfKind > 0 && straight == 0 && flush == 0 && fullHouse == 0 && fourOfKind == 0) {
            System.out.println("Three of Kind : Highest");
        }
        else if (pair == 0 && twoPair == 0 && threeOfKind == 0 && straight > 0 && flush == 0 && fullHouse == 0 && fourOfKind == 0) {
            System.out.println("Straight : Highest");
        }
        else if (pair == 0 && twoPair == 0 && threeOfKind == 0 && straight == 0 && flush > 0 && fullHouse == 0 && fourOfKind == 0) {
            System.out.println("Flush : Highest");
        }
        else if (pair == 0 && twoPair == 0 && threeOfKind == 0 && straight == 0 && flush == 0 && fullHouse > 0 && fourOfKind == 0) {
            System.out.println("Full House : Highest");
        }
        else if (pair == 0 && twoPair == 0 && threeOfKind == 0 && straight == 0 && flush == 0 && fullHouse == 0 && fourOfKind > 0) {
            System.out.println("Four of Kind : Highest");
        }
        else {
            System.out.println("None : Highest");
        }
    }

}
