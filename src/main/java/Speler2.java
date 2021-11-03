import java.util.LinkedList;

public class Speler2 {
    private String naam;
    private int weekNr;

    // De tijdelijke dataopslag
    private LinkedList<Order> history2;

    public Speler2(String naam) {
        this.naam = naam;
        this.weekNr = 1;
        history2 = new LinkedList<>();
    }

    public void plaatsOrder(int aantal){
        Order order = new Order(weekNr, this.naam, aantal);
        history2.add(order);
        weekNr++;
    }

    @Override
    public String toString() {
        return "Speler2{" +
                "naam='" + naam + '\'' +
                ", history2=" + history2.toString() +
                '}';
    }
}
