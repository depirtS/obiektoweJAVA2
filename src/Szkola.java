public class Szkola {
    private String nazwa;
    private int nr;
    private static Szkola szkola = new Szkola("zs10", 2137);
    private Szkola(String nazwa, int nr){
        this.nazwa = nazwa;
        this.nr = nr;
        //prywatny konstruktor
        //Nie mozna wywloac go poza klaso
    }

    public static Szkola getSzkola(){
        return szkola;
    }
}
