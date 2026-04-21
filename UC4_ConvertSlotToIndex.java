public class UC4_ConvertSlotToIndex {
    private static final int BOARD_SIZE = 3;

    // Method to convert slot number (1-9) to row index (0-2)
    public static int getRowIndex(int slot) {
        return (slot - 1) / BOARD_SIZE;
    }

    // Method to convert slot number (1-9) to column index (0-2)
    public static int getColumnIndex(int slot) {
        return (slot - 1) % BOARD_SIZE;
    }

    // Method to display the conversion mapping
    public static void displaySlotMapping() {
        System.out.println("Slot to Board Index Mapping:");
        System.out.println("============================");
        System.out.println("Slot | Row | Col");
        System.out.println("-----|-----|----");
        
        for (int slot = 1; slot <= 9; slot++) {
            int row = getRowIndex(slot);
            int col = getColumnIndex(slot);
            System.out.printf(" %d   |  %d  |  %d\n", slot, row, col);
        }
    }

    // Main method to test the conversion
    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe!\n");
        
        // Display board position reference
        System.out.println("Board Positions (1-9):");
        System.out.println(" 1 | 2 | 3");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9\n");

        // Display slot to index mapping
        displaySlotMapping();

        // Test conversion with examples
        System.out.println("\n\nExample Conversions:");
        System.out.println("===================");
        int[] testSlots = {1, 5, 9};
        for (int slot : testSlots) {
            int row = getRowIndex(slot);
            int col = getColumnIndex(slot);
            System.out.println("Slot " + slot + " → Row: " + row + ", Column: " + col);
        }
    }
}
