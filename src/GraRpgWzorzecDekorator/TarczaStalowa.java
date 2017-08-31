package GraRpgWzorzecDekorator;

public class TarczaStalowa extends Tarcza {

    public TarczaStalowa() {
        opis = "Tarcza Stalowa";
    }

    @Override
    public int obrona() {
        return 20;
    }
}
