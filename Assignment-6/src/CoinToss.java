/* (Coin Tossing) 
Write an application that simulates coin tossing. 
Let the program toss a coin each time the user chooses 
the “Toss Coin” menu option. Count the number of times each 
side of the coin appears. Display the results. The program should 
call a separate method flip that takes no arguments and returns a 
value from a Coin enum (HEADS and TAILS). [Note:If the program realistically 
simulates coin tossing, each side of the coin should appear 
approximately half the time.] */

import java.security.SecureRandom;
import java.util.Scanner;


public class CoinToss {

    private static final SecureRandom randomNum = new SecureRandom();
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int heads = 0;
        int tails = 0;
        int choice = 0;

        do {
            System.out.println("1. Toss Coin");
            System.out.println("2. Exit");
            System.out.println("Choice: ");

            choice = input.nextInt();

            if (choice == 1) {

                flip();

                if (flip()) {
                    heads++;
                }
                else {
                    tails++;
                }
                System.out.printf("Heads: %d, Tails: %d\n", heads, tails);


            }
        }while(choice !=2);
    }
    public static boolean flip() {

        return randomNum.nextInt(2) == 1;

    }
}
