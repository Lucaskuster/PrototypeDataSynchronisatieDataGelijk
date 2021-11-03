import java.util.LinkedList;

public class GameHistory {
    private String gameNaam;
    private LinkedList<Order> dataopslag = new LinkedList<>();

    public GameHistory(String gameNaam) {
        this.gameNaam = gameNaam;
    }

    @Override
    public String toString() {
        return "GameHistory{" +
                "gameNaam='" + gameNaam + '\'' +
                ", dataopslag=" + dataopslag +
                '}';
    }
}
