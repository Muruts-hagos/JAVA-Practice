import java.util.Scanner;

public class InteractionUtilisateur {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] getMoveFromPlayer(Player player) {
        int row, col;
        while (true) {
            View.promptPlayerMove(player);
            row = scanner.nextInt();
            col = scanner.nextInt();
            if (row >= 0 && row < 3 && col >= 0 && col < 3) {
                break; // Valid move
            } else {
                View.invalidMove(); // Invalid move
            }
        }
        return new int[]{row, col};
    }
}