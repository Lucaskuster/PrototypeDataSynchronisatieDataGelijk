import java.util.LinkedList;

public class Speler2 implements ISpeler {
    private String naam;
    private int weekNr;

    // De tijdelijke dataopslag
    private LinkedList<Order> dataopslag2;

    public Speler2(String naam) {
        this.naam = naam;
        this.weekNr = 1;

        dataopslag2 = new LinkedList<Order>();
    }

    public void plaatsOrder(int aantal) {
        Order order = new Order(weekNr, this.naam, aantal);
        dataopslag2.add(order);
        weekNr++;
    }

    @Override
    public String toString() {
        return "Speler2{" +
                "naam='" + naam + '\'' +
                ", history2=" + dataopslag2.toString() +
                '}';
    }
}
