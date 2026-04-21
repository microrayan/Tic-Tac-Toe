public class UC5_ValidateUserMove {
    private static final int BOARD_SIZE = 3;
    private char[][] board;

    // Constructor to initialize the board
    public UC5_ValidateUserMove() {
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

    // Method to validate if a move is valid
    public boolean isValidMove(int row, int col) {
        // Check if row and column are within bounds (0-2)
        if (row < 0 || row >= BOARD_SIZE || col < 0 || col >= BOARD_SIZE) {
            System.out.println("Error: Row and column must be between 0 and " + (BOARD_SIZE - 1));
            return false;
        }

        // Check if the cell is empty
        if (board[row][col] != '-') {
            System.out.println("Error: Cell at [" + row + "][" + col + "] is already occupied!");
            return false;
        }

        return true;
    }

    // Method to place a move on the board
    public void placeMove(int row, int col, char symbol) {
        if (isValidMove(row, col)) {
            board[row][col] = symbol;
            System.out.println("Move accepted! Placed '" + symbol + "' at [" + row + "][" + col + "]");
        } else {
            System.out.println("Move rejected!");
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

    // Main method to test validation
    public static void main(String[] args) {
        UC5_ValidateUserMove game = new UC5_ValidateUserMove();

        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println("Testing Move Validation\n");

        // Display initial board
        System.out.println("Initial Board:");
        game.displayBoard();

        // Test valid move
        System.out.println("Test 1: Valid move at [0][0]");
        game.placeMove(0, 0, 'X');
        game.displayBoard();

        // Test valid move
        System.out.println("Test 2: Valid move at [1][1]");
        game.placeMove(1, 1, 'O');
        game.displayBoard();

        // Test invalid move - cell already occupied
        System.out.println("Test 3: Invalid move - cell already occupied at [0][0]");
        game.placeMove(0, 0, 'X');
        game.displayBoard();

        // Test invalid move - out of bounds
        System.out.println("Test 4: Invalid move - out of bounds at [3][3]");
        game.placeMove(3, 3, 'X');
        game.displayBoard();

        // Test invalid move - negative indices
        System.out.println("Test 5: Invalid move - negative index at [-1][0]");
        game.placeMove(-1, 0, 'O');
        game.displayBoard();
    }
}
