
public class Main {
    public static void main(String[] args) {
        System.out.println("dziala");
        Osoba osoba = new Osoba();
        osoba.setImie("Jan");
        System.out.println("imie naszej osoby " + osoba.getImie());
        osoba.setWiek(-20);
        System.out.println("Wiek " + osoba.getWiek());
        }
    }