public class Player {

    public final static String X = "| X " ;
    public final static String O = "| O " ;

    public Player() {
        this(X);
    }

    public Player(String player) {
        representation=player;
    }

    private String representation;


    public String getRepresentation() {
        return representation;
    }

}
