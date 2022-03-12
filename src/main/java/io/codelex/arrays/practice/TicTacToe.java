package io.codelex.arrays.practice;
import java.util.Scanner;

public class TicTacToe {

    private static final char[][] BOARD = new char[3][3];
    static boolean won = true;

    public static void main(String[] args) {
        initBoard();
        displayBoard();

        int i = 0;
        while (i < 9) {
            Scanner keyboard = new Scanner(System.in);

            System.out.print("'O', choose your location (row): ");
            int row = keyboard.nextInt();
            System.out.print("'O', choose your location (column): ");
            int column = keyboard.nextInt();

            BOARD[row][column] = 'O';
            displayBoard();
            checkWinner();
            if (!won) break;

            System.out.print("'X', choose your location (row): ");
            int row1 = keyboard.nextInt();
            System.out.print("'X', choose your location (column): ");
            int column1 = keyboard.nextInt();

            BOARD[row1][column1] = 'X';
            displayBoard();
            checkWinner();
            if (!won) break;

            i++;
        }
    }

    public static void checkWinner() {
        if (
                   (BOARD[0][0] == 'X' && BOARD[1][1] == 'X' && BOARD[2][2] == 'X' )
                || (BOARD[2][0] == 'X' && BOARD[1][1] == 'X' && BOARD[0][2] == 'X' )
                || (BOARD[0][0] == 'X' && BOARD[1][0] == 'X' && BOARD[2][0] == 'X' )
                || (BOARD[0][1] == 'X' && BOARD[1][1] == 'X' && BOARD[2][1] == 'X' )
                || (BOARD[0][2] == 'X' && BOARD[1][2] == 'X' && BOARD[2][2] == 'X' )
                || (BOARD[0][0] == 'X' && BOARD[0][1] == 'X' && BOARD[0][2] == 'X' )
                || (BOARD[1][0] == 'X' && BOARD[1][1] == 'X' && BOARD[1][2] == 'X' )
                || (BOARD[2][0] == 'X' && BOARD[2][1] == 'X' && BOARD[2][2] == 'X' )
        ) {
            won = false;
            System.out.println("'X' won!");
        } else if (
                (BOARD[0][0] == 'O' && BOARD[1][1] == 'O' && BOARD[2][2] == 'O' )
                || (BOARD[2][0] == 'O' && BOARD[1][1] == 'O' && BOARD[0][2] == 'O' )
                || (BOARD[0][0] == 'O' && BOARD[1][0] == 'O' && BOARD[2][0] == 'O' )
                || (BOARD[0][1] == 'O' && BOARD[1][1] == 'O' && BOARD[2][1] == 'O' )
                || (BOARD[0][2] == 'O' && BOARD[1][2] == 'O' && BOARD[2][2] == 'O' )
                || (BOARD[0][0] == 'O' && BOARD[0][1] == 'O' && BOARD[0][2] == 'O' )
                || (BOARD[1][0] == 'O' && BOARD[1][1] == 'O' && BOARD[1][2] == 'O' )
                || (BOARD[2][0] == 'O' && BOARD[2][1] == 'O' && BOARD[2][2] == 'O' )
        ) {
            won = false;
            System.out.println("'O' won!");
        } else {
            for (char[] cell : BOARD) {
                int count = 0;
                for (int i = 0; i < BOARD.length; i++) {
                    if (cell[i] != ' ') count++;
                }
                if (count == 9) {
                    won = false;
                    System.out.println("The game is a tie.");
                }
            }
        }
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                BOARD[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println();
        System.out.println("  0  " + BOARD[0][0] + "|" + BOARD[0][1] + "|" + BOARD[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + BOARD[1][0] + "|" + BOARD[1][1] + "|" + BOARD[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + BOARD[2][0] + "|" + BOARD[2][1] + "|" + BOARD[2][2]);
        System.out.println("     0 1 2 ");
        System.out.println();
    }
}