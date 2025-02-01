
import java.util.Random;
public class ArteficialPlayer extends Player {
    private Random random = new Random();
    public ArteficialPlayer(String representation) {
        super(representation);
        this.random = new Random();
    }

    @Override
    public int[] pickCordinates() {
        int row = random.nextInt(3);
        int col = random.nextInt(3);
        return new int[]{row, col};
        // code for bote to pick coordinate
    }
}
