public class Main {

    public static void main(String[] args) {
        Speler1 speler1 = new Speler1("naam1");
        Speler2 speler2 = new Speler2("naam1");

        speler1.plaatsOrder(4);
        speler2.plaatsOrder(4);
        speler1.plaatsOrder(6);
        speler2.plaatsOrder(8);

        System.out.println(speler1.toString());
        System.out.println(speler2.toString());
    }
}
