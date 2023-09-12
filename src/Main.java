
public class Main {
    public static void main(String[] args) {
        System.out.println("dziala");
        Osoba osoba = new Osoba();
        osoba.setImie("Jan");
        System.out.println("imie naszej osoby " + osoba.getImie());
        osoba.setWiek(-20);
        System.out.println("Wiek " + osoba.getWiek());

        Osoba osoba2 = new Osoba("Ola","Starsza",19);
        System.out.println(osoba2);

        Uczen uczen1P1 = new Uczen("Emil", "Smalandzki",12);
        Uczen uczen1P2 = new Uczen("Emilia","Pragmatyczna",9);
        System.out.println(uczen1P1);
        System.out.println(uczen1P2);
    }}