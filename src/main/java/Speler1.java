import java.util.LinkedList;

public class Speler1 {
    private String naam;
    private int weekNr;

    // De tijdelijke dataopslag
    private LinkedList<Order> history1;

    public Speler1(String naam) {
        this.naam = naam;
        this.weekNr = 1;
        history1 = new LinkedList<>();
    }

    public void plaatsOrder(int aantal) {
        Order order = new Order(weekNr, this.naam, aantal);
        history1.add(order);
        weekNr++;
    }

    @Override
    public String toString() {
        return "Speler1{" +
                "naam='" + naam + '\'' +
                ", history1=" + history1.toString() +
                '}';
    }
}
