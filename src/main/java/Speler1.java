import java.util.LinkedList;

public class Speler1 implements ISpeler{

    // De tijdelijke dataopslag
    private LinkedList<Order> dataopslag1;

    public Speler1(String naam) {
        super(naam, 1);
    }

    public void plaatsOrder(int aantal) {
        Order order = new Order(super.weeknr, this.naam, aantal);
        dataopslag1.add(order);
        SendOrder(order);
        weekNr++;
    }


    private void SendOrder(Order order) {

    }

    @Override
    public String toString() {
        return "Speler1{" +
                "naam='" + naam + '\'' +
                ", history1=" + dataopslag1.toString() +
                '}';
    }
}
