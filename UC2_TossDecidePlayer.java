import java.util.Random;

public class UC2_TossDecidePlayer {
    private static final int BOARD_SIZE = 3;
    private char[][] board;
    private char humanSymbol;
    private char computerSymbol;
    private char currentPlayer;

    // Constructor to initialize the game
    public UC2_TossDecidePlayer() {
        board = new char[BOARD_SIZE][BOARD_SIZE];
        initializeBoard();
        performToss();
    }

    // Method to initialize the board with empty cells
    private void initializeBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Method to perform toss and decide first player and symbols
    private void performToss() {
        Random random = new Random();
        int tossResult = random.nextInt(2); // 0 or 1

        if (tossResult == 0) {
            // Human wins toss and plays first with X
            humanSymbol = 'X';
            computerSymbol = 'O';
            currentPlayer = 'X';
            System.out.println("Toss Result: Human wins! You play first with symbol 'X'");
        } else {
            // Computer wins toss and plays first with X
            humanSymbol = 'O';
            computerSymbol = 'X';
            currentPlayer = 'X';
            System.out.println("Toss Result: Computer wins! Computer plays first with symbol 'X'");
        }
    }

    // Method to display the board
    public void displayBoard() {
        System.out.println();
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(" " + board[i][j] + " ");
                if (j < BOARD_SIZE - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < BOARD_SIZE - 1) {
                System.out.println("-----------");
            }
        }
        System.out.println();
    }

    // Method to display game state
    public void displayGameState() {
        System.out.println("\n=== Game State ===");
        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
        System.out.println("Current Player: " + currentPlayer);
        System.out.println("==================\n");
    }

    // Main method
    public static void main(String[] args) {
        UC2_TossDecidePlayer game = new UC2_TossDecidePlayer();
        
        // Display welcome message
        System.out.println("Welcome to Tic-Tac-Toe!");
        
        // Display game state after toss
        game.displayGameState();
        
        // Display empty board
        game.displayBoard();
    }
}
