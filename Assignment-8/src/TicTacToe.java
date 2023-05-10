/* (Tic-Tac-Toe) 
Create a class TicTacToe that will enable you to write a program to play Tic-Tac-Toe. 
The class contains a private 3-by-3 two-dimensional array. Use an enum type to represent 
the value in each cell of the array. The enum’s constants should be named X, O and EMPTY 
(for a position that does not contain an X or an O). The constructor should initialize 
the board elements to EMPTY. Allow two human players. Wherever the first player moves, 
place an X in the specified square, and place an O wherever the second player moves. 
Each move must be to an empty square. After each move, determine whether the game has been 
won and whether it’s a draw. If you feel ambitious, modify your program so that the computer 
makes the moves for one of the players. Also, allow the player to specify whether he or she
 wants to go first or second.  */

import java.util.*;


public class TicTacToe {

    enum Spot {
        X, O, EMPTY
    };

    private static Spot turn = Spot.X;
    private static Spot[][] board = new Spot[3][3];

    // Initial Board to Empty
    public static void setInitialBoard() {
        for(int i = 0; i < 3 ; i++) {
            for(int j = 0; j<3; j++) {
                board[i][j] = Spot.EMPTY; 
            }
        }
    }

    // Choose Spot
    public static void chooseSpot(int x, int y) {
        if (board[x][y] == Spot.EMPTY) {
            board[x][y] = turn;
            switchTurn();
        }
        else {
            System.out.println("Invalid value please enter a position");
        }

    }

    // Display Board
    public static void displayBoard() {
        for(int i = 0; i < 3; i++) {
            System.out.println();
            for(int j = 0; j < 3 ; j++) {
                System.out.print(board[i][j] + "|" + "   ");
            }
            System.out.println();
            System.out.println("--------------------");
        }
    }

    // Enter Position
    public static int enterPosition() {
    Scanner input = new Scanner(System.in);
    //input.close();
    return input.nextInt();
    }

    // check winner
    public static Boolean checkWinner() {
        // Top Line
        if ((board[0][0] == Spot.X && board[0][1] == Spot.X && board[0][2] == Spot.X) || 
            (board[0][0] == Spot.O && board[0][1] == Spot.O && board[0][2] == Spot.O)) {
            return true;
        }
        // Middle Line
        if ((board[1][0] == Spot.X && board[1][1] == Spot.X && board[1][2] == Spot.X) || 
            (board[1][0] == Spot.O && board[1][1] == Spot.O && board[1][2] == Spot.O)) {
            return true;
        }
        // Bottom Line
        if ((board[2][0] == Spot.X && board[2][1] == Spot.X && board[2][2] == Spot.X) || 
            (board[2][0] == Spot.O && board[2][1] == Spot.O && board[2][2] == Spot.O)) {
            return true;
        }
        // Side Left Line
        if ((board[0][0] == Spot.X && board[1][0] == Spot.X && board[2][0] == Spot.X) || 
            (board[0][0] == Spot.O && board[1][0] == Spot.O && board[2][0] == Spot.O)) {
            return true;
        }
        // Side Right Line
        if ((board[0][2] == Spot.X && board[1][2] == Spot.X && board[2][2] == Spot.X) || 
            (board[0][2] == Spot.O && board[1][2] == Spot.O && board[2][2] == Spot.O)) {
            return true;
        }
        // Side Middle Line
        if ((board[0][1] == Spot.X && board[1][1] == Spot.X && board[2][1] == Spot.X) || 
            (board[0][1] == Spot.O && board[1][1] == Spot.O && board[2][1] == Spot.O)) {
            return true;
        }
        // Left Diagnol
        if ((board[0][0] == Spot.X && board[1][1] == Spot.X && board[2][2] == Spot.X) || 
            (board[0][0] == Spot.O && board[1][1] == Spot.O && board[2][2] == Spot.O)) {
            return true;
        }
        // Right Diagnol
        if ((board[0][2] == Spot.X && board[1][1] == Spot.X && board[2][0] == Spot.X) || 
            (board[0][2] == Spot.O && board[1][1] == Spot.O && board[2][0] == Spot.O)) {
            return true;
        }
        if (board[0][0] == Spot.EMPTY && board[0][1] == Spot.EMPTY && board[0][2] == Spot.EMPTY && 
            board[1][0] == Spot.EMPTY && board[1][1] == Spot.EMPTY && board[1][2] == Spot.EMPTY && 
            board[2][0] == Spot.EMPTY && board[2][1] == Spot.EMPTY && board[2][2] == Spot.EMPTY) {
            System.out.println("Draw");
            return true;
        }
        else {
            return false;
        }
    }
    // Switch Turn
    public static void switchTurn() {
        turn = (turn == Spot.X)?Spot.O:Spot.X;
    }

    public static void main(String[] args) throws Exception {
        setInitialBoard();
        displayBoard();
        while (checkWinner() == false) {
            //switchTurn();
            chooseSpot(enterPosition(), enterPosition());
            displayBoard();
        }
    }
}

