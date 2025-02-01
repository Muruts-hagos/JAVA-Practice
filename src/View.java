public class View {
    public static void displayBoard(Cell[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j].getRepresentation());
            }
            System.out.println("|");
            System.out.println("-".repeat(10));
        }
    }

    public static void promptPlayerMove(Player player) {
        System.out.println(player.getRepresentation() + "'s turn. Enter row and column (0, 1, or 2): ");
    }

    public static void invalidMove() {
        System.out.println("Invalid move. Try again.");
    }

    public static void announceWinner(Player player) {
        System.out.println(player.getRepresentation() + " wins!");
    }

    public static void announceDraw() {
        System.out.println("Game Over with no winner");
    }
}