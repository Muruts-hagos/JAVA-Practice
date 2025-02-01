public class TicTacToe {
    private static int SIZE = 3; // Board size (3x3)
    private final Cell[][] board;
    private final Player player1;
    private final Player player2;

    public TicTacToe(Player player1, Player player2) {
        this.board = new Cell[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = new Cell(); // Initialize each cell
            }
        }
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Player currentPlayer = player1;
        for (int i = 0; i < SIZE * SIZE; i++) {
            View.displayBoard(board);
            int[] move = currentPlayer.pickCordinates();
            while (!isValidMove(move[0], move[1])) {
                View.invalidMove();
                move = currentPlayer.pickCordinates();
            }
            setOwner(move[0], move[1], currentPlayer);
            if (checkWinner(currentPlayer)) {
                View.displayBoard(board);
                View.announceWinner(currentPlayer);
                return;
            }
            currentPlayer = (currentPlayer == player1) ? player2 : player1; // Switch players
        }
        View.displayBoard(board);
        View.announceDraw();
    }

    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col].getRepresentation().equals("|  ");
    }

    private void setOwner(int row, int col, Player player) {
        board[row][col].setRepresentation(player.getRepresentation());
    }

    private boolean checkWinner(Player player) {
        String rep = player.getRepresentation();

        // Check rows
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0].getRepresentation().equals(rep) && board[i][1].getRepresentation().equals(rep) && board[i][2].getRepresentation().equals(rep)) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < SIZE; i++) {
            if (board[0][i].getRepresentation().equals(rep) && board[1][i].getRepresentation().equals(rep) && board[2][i].getRepresentation().equals(rep)) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0].getRepresentation().equals(rep) && board[1][1].getRepresentation().equals(rep) && board[2][2].getRepresentation().equals(rep)) {
            return true;
        }
        return board[0][2].getRepresentation().equals(rep) && board[1][1].getRepresentation().equals(rep) && board[2][0].getRepresentation().equals(rep);
    }
}