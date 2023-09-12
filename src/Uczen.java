public class Uczen extends Osoba{
    private int nrUcznia;
    private static int ileUczniow = 0;

    //right click - generate - constructor

    public Uczen(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek);
        ileUczniow++;
        nrUcznia = ileUczniow;
    }

    //right click - generate - toString()

    @Override
    public String toString() {
        return "Uczen{imie: " + getImie() + " nazwisko: " + getNazwisko() + " nrUcznia: " + nrUcznia + "}";
    }
}
