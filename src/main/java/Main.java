public class Main {

    public static void main(String[] args) {
        Speler1 speler1 = new Speler1("naam1");
        Speler2 speler2 = new Speler2("naam1");

        speler1.plaatsOrder(4);
        speler2.plaatsOrder(4);
        speler1.GetOrderFromOtherPlayers();
        speler1.plaatsOrder(6);
        speler2.plaatsOrder(8);

        System.out.println(speler1.toString());
        System.out.println(speler2.toString());
    }


}

/*
ik maak een game met gamenaam aan
Deze heeft speler, je kan niet later erbij komen.

zo heb je een begin situatie waarbij de spelers vanaf de rondens kunnen beginnen

 */

    /*public static GameHistory gameStart(LinkedList<ISpeler> spelers){
        return new GameHistory("test", spelers);
    } */
