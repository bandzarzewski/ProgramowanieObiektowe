package GraRpgWzorzecDekorator;

// musze mieć metode ktora wydrukuje toStringa

public abstract class Tarcza {
    protected String opis;

    public String pobierzOpis() {
        return opis;
    }

    public abstract int obrona();

}
