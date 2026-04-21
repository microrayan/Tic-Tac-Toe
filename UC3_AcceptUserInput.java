import java.util.Scanner;

public class UC3_AcceptUserInput {
    private static final int BOARD_SIZE = 3;
    private static final int MIN_SLOT = 1;
    private static final int MAX_SLOT = 9;

    // Method to accept user slot input
    public static int getUserSlotInput() {
        Scanner scanner = new Scanner(System.in);
        int slot = -1;

        while (true) {
            System.out.print("Enter slot number (1-9): ");
            
            // Check if input is an integer
            if (scanner.hasNextInt()) {
                slot = scanner.nextInt();
                
                // Validate slot is within range
                if (slot >= MIN_SLOT && slot <= MAX_SLOT) {
                    return slot;
                } else {
                    System.out.println("Invalid input! Please enter a number between 1 and 9.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }

    // Main method to test the input functionality
    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println("Board positions are numbered 1-9:\n");
        System.out.println(" 1 | 2 | 3");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9\n");

        // Get user input
        int userSlot = getUserSlotInput();
        System.out.println("You selected slot: " + userSlot);
    }
}
