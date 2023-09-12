public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;

    //przeciazenie meetod - metody mogo miec te same nazwy,
    //ale maja inne argumenty
    //right click - generate - constructor
    public Osoba(){
        this.imie = "Edward";
        this.nazwisko = "Nowak";
        this.wiek = 30;
    }

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    //right click - generate - getter
    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    //right click - generate - setter
    public void setImie(String imie) {
        if (imie.length()<3)
            System.out.println("Imie musi miec co najmniej 3 znaki");
        else {
            //TODO: sprawdzic czy tylko litery
            //TODO: pierwsza litera duza pozostale male
            this.imie = imie;
        }
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        if (wiek < 0){
            this.wiek = 0;
        }
        else {
            this.wiek = wiek;
        }
    }
    //right click - generate - toString()

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}

