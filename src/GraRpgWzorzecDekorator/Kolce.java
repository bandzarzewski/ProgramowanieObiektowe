package GraRpgWzorzecDekorator;

public class Kolce extends DodatkoweElementyTarczy {

    private Tarcza _tarcza;

    public Kolce(Tarcza tarcza) {
        this._tarcza = tarcza;
    }

    @Override
    public String pobierzOpis() {
        return _tarcza.pobierzOpis() + " Jadowite kolce ";
    }

    @Override
    public int obrona() {
        return _tarcza.obrona() + 15;
    }
}
