// Card shuffling and dealing

public class DeckOfCardsTest {
    // execute application

    public static void main(String[] args) {

        int[] player = new int[2];
        String[] playerCard = new String[2];

        for (int z = 0; z < 2; z++) {
            DeckOfCards myDeckOfCards = new DeckOfCards();
            myDeckOfCards.shuffle(); // place cards in random order
            Card[] hand = new Card[50];
            String[] face = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
            String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};


            int[] numberFace = new int[15];
            int[] numberSuit = new int[5];

            int pair = 0;
            int twoPair = 0;
            int threeOfKind = 0;
            int straight = 0;
            int flush = 0;
            int fullHouse = 0;
            int fourOfKind = 0;

            // print all 52 cards in the order in which they are dealt
            for (int i = 1; i <= 5; i++) {
                // deal and display a Card
                //System.out.printf("%-19s", myDeckOfCards.dealCard());
                hand[i] = myDeckOfCards.dealCard();
                //System.out.print(hand[1].getFace());
                System.out.print(hand[i] + " ");
                
                if (i % 5 == 0) { // output a newline after every fourth card
                    System.out.println();
                }
            }
            // Store Face to Index
            for (int i = 0; i < 13; i++) { // loop faces
                for (int j = 1; j <= 5; j++) { //loop hand
                    if (face[i] == hand[j].getFace()) {
                        if (numberFace[i] > 1) {
                            numberFace[i] = numberFace[i] + 1;
                        }
                        else {
                            numberFace[i] = numberFace[i]+1;
                        }
                    }

                }
            }
            // Store Suit to Index
            for (int i = 0; i < 4; i++) {
                for (int j = 1; j <= 5; j++) {
                    if (suit[i] == hand[j].getSuit()) {
                        numberSuit[i] = numberSuit[i] + 1;
                    }
                }
            }

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
                //System.out.println("Pair : Highest");
                player[z] = 1;
                playerCard[z] = "Pair";
            }
            else if (pair > 0 && twoPair > 0 && threeOfKind == 0 && straight == 0 && flush == 0 && fullHouse == 0 && fourOfKind == 0) {
                //System.out.println("Two Pair : Highest");
                player[z] = 2;
                playerCard[z] = "Two Pair";
            }
            else if (pair == 0 && twoPair == 0 && threeOfKind > 0 && straight == 0 && flush == 0 && fullHouse == 0 && fourOfKind == 0) {
                //System.out.println("Three of Kind : Highest");
                player[z] = 3;
                playerCard[z] = "Three of Kind";
            }
            else if (pair == 0 && twoPair == 0 && threeOfKind == 0 && straight > 0 && flush == 0 && fullHouse == 0 && fourOfKind == 0) {
                //System.out.println("Straight : Highest");
                player[z] = 4;
                playerCard[z] = "Straight";
            }
            else if (pair == 0 && twoPair == 0 && threeOfKind == 0 && straight == 0 && flush > 0 && fullHouse == 0 && fourOfKind == 0) {
                //System.out.println("Flush : Highest");
                player[z] = 5;
                playerCard[z] = "Flush";
            }
            else if (pair == 0 && twoPair == 0 && threeOfKind == 0 && straight == 0 && flush == 0 && fullHouse > 0 && fourOfKind == 0) {
                //System.out.println("Full House : Highest");
                player[z] = 6;
                playerCard[z] = "Full House";
            }
            else if (pair == 0 && twoPair == 0 && threeOfKind == 0 && straight == 0 && flush == 0 && fullHouse == 0 && fourOfKind > 0) {
                //System.out.println("Four of Kind : Highest");
                player[z] = 7;
                playerCard[z] = "Four of Kind";
            }
            else {
                //System.out.println("None : Highest");
                player[z] = 0;
                playerCard[z] = "None";
            }

        }
        if (player[0] > player[1]) {
            System.out.println("Player 1 Won : " + playerCard[0]);
        }
        else if (player[0] < player[1]) {
            System.out.println("Player 2 Won : " + playerCard[1]);
        }
        else if (player[0] == player[1]) {
            System.out.println("Tie");
        }

    }
}
