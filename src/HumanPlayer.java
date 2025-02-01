public class HumanPlayer extends Player {
    public HumanPlayer(String representation) {
        super(representation);
    }
    @Override
    public int[] pickCordinates() {
        return InteractionUtilisateur.getMoveFromPlayer(this);
        // code to get user inputted coordinates
    }
}
