public class Uczen extends Osoba implements Dyzurny{
    private int nrUcznia;
    private static int ileUczniow = 0;

    //right click - generate - constructor

    /**
     * Uczen - konstruktor klasy Uczen dziedzący z klasa Osoba
     * @param imie - imie z klasy Osoba
     * @param nazwisko - nazwsko z klasy Osoba
     * @param wiek - wiek z klasy Osoba
     * @return - brak
     */
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

    @java.lang.Override
    public void dyzuruj() {
        System.out.println("Wycieranie tablicy");
    }
}
