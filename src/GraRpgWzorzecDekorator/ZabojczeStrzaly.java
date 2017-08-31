package GraRpgWzorzecDekorator;


public class ZabojczeStrzaly extends DodatkoweElementyTarczy {

    private Tarcza _tarcza;

    public ZabojczeStrzaly(Tarcza tarcza) {
        this._tarcza = tarcza;
    }

    @Override
    public String pobierzOpis() {
        return _tarcza.pobierzOpis() + " ZabojczeStrzaly ";
    }

    @Override
    public int obrona() {
        return _tarcza.obrona() + 35;
    }
}
