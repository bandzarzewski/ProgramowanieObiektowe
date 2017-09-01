package GraRpgWzorzecDekorator;


public abstract class Miecz {
    protected String opis;

    public String pobierzOpis() {
        return opis;
    }

    public abstract int obrona();
}
