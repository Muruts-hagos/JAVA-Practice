import java.util.Scanner;

class TicTacToe {

    private static final int SIZE = 3;
    private final Cell[][] board;
public Player currentPlayer;

    // Constructor to initialize the board
    public TicTacToe() {
        board = new Cell[SIZE][SIZE];  // 2D array of Cells
        currentPlayer=new Player(Player.X);
        // Initialize each cell
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = new Cell();// Instantiate a new Cell for each position
            }
        }

    }
    public void display() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i] [j].getRepresentation());
            }

            System.out.println();
        }
    }
    // Method to get the move from the player
    public int[] getMoveFromPlayer(){
        Scanner scanner =new Scanner(System.in);
        int row=-1 ,col=-1;
        while (true){
            System.out.println("\"Enter your move (row and column) separated by a space:\"");
        }

    }
}