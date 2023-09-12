import java.util.ArrayList;

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
