public class TicTacToe {
    private static final int BOARD_SIZE = 3;
    private char[][] board;

    // Constructor to initialize the board
    public TicTacToe() {
        board = new char[BOARD_SIZE][BOARD_SIZE];
        initializeBoard();
    }

    // Method to initialize the board with empty cells
    private void initializeBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = '-';
            }
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

    // Main method
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        
        // Display welcome message and empty board
        System.out.println("Welcome to Tic-Tac-Toe!");
        game.displayBoard();
    }
}
