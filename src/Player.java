
public abstract class Player {
    private String representation;

    public Player(String representation) {
        this.representation = representation;
    }
    public abstract int[] pickCordinates();
    public String getRepresentation() {
        return representation;
    }
}