import java.util.LinkedList;

public class Speler1 implements ISpeler {
    private String naam;
    private int weekNr;

    // De tijdelijke dataopslag
    private LinkedList<Order> dataopslag1;

    public Speler1(String naam) {
        this.naam = naam;
        this.weekNr = 1;

        dataopslag1 = new LinkedList<Order>();
    }

    public void plaatsOrder(int aantal) {
        Order order = new Order(weekNr, this.naam, aantal);
        dataopslag1.add(order);
        SendOrderToOtherPlayers(order);
        weekNr++;
    }

    private void SendOrderToOtherPlayers(Order order) {
        // Stap 1 zet de order in een pakket om te versturen
        // Stap 2 pak de lijst met adressen van spelers waar de order naar toe moet (in de data)
        // Stap 3 verzend de orders naar alle spelers (dataopslag)
        // Stap 4 zie getOrder


        // vraag gaan we de gehele opslag controleren bij elke beurt, of voegen we alleen de order bij iedereen toe?
    }

    public void GetOrderFromOtherPlayers(Order order){

        // Stap 1 er komt een geplaatste order binnen van een van de andere spelers

        // Stap 2 pak deze uit en maak er weer een 'java' object van.

        // Stap 3 voeg hem toe aan je eigen opslag.
        dataopslag1.add(order);

        // wanneer roep je deze aan?
        // Met een listener op alle andere spelers, komt er wat binnen dan roep je deze aan.
    }

    @Override
    public String toString() {
        return "Speler1{" +
                "naam='" + naam + '\'' +
                ", history1=" + dataopslag1.toString() +
                '}';
    }
}
