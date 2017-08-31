package GraRpgWzorzecDekorator;

public class TarczaRakietowa extends Tarcza {

    public TarczaRakietowa() {
        opis = "TarczaRakietowa";
    }

    @Override
    public int obrona() {
        return 40;
    }
}
