import java.util.ArrayList;

/**
 * Klasa - reprezentuje zespół uczniów
 */
public class Klasa {
    private ArrayList<Uczen> uczniowie = new ArrayList<>();
    private  String nazwa;

    public  Klasa(String nazwa){
        this.nazwa = nazwa;
    }

    public Klasa(Klasa klasa){
        //konstruktor kopiujacy
        this.uczniowie = klasa.uczniowie;
        this.nazwa = klasa.nazwa;
    }

    public Klasa( String nazwa, Uczen ...uczeniowe){
        for(Uczen uczen:uczniowie
        ) {
            this.uczniowie.add(uczen);
        }
    }

    /**
     * dodajUczniaDoKlasy metoda która umożliwia dodawanie ucznia klasy Uczen do pola Uczniowie w obiekcie klasy Klasa
     * @param uczen - obiekt reprezentujacy pojedynczego ucznia
     * @return - brak
     */
    public void dodajUczniaDoKlasy(Uczen uczen){
        uczniowie.add(uczen);
    }

    @Override
    public String toString() {
        return "Klasa{" +
                "uczniowie=" + uczniowie +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
