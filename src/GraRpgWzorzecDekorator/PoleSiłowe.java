package GraRpgWzorzecDekorator;


public class PoleSiłowe extends DodatkoweElementyTarczy {

    private Tarcza _tarcza;

    public PoleSiłowe(Tarcza tarcza) {
        this._tarcza = tarcza;
    }

    @Override
    public String pobierzOpis() {
        return _tarcza.pobierzOpis() + " Pole siłowe ";
    }

    @Override
    public int obrona() {
        return _tarcza.obrona() + 25;
    }
}
