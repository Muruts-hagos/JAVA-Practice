public class Main {
    public static void main(String[] args) {
        // Create players (human vs AI, human vs human, or AI vs AI)
        Player player1 = new HumanPlayer("| X ");
        Player player2 = new ArteficialPlayer("|O");

        // Create the game and start playing
        TicTacToe game = new TicTacToe(player1, player2);
        game.play();
    }
}