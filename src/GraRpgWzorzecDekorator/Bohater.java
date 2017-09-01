package GraRpgWzorzecDekorator;

public class Bohater {


    Zasobnik _zasobnik;
    Miecz _miecz;
    private String _imie; // = "Rycerz bez głowy";
    private Tarcza _tarcza;

    public Bohater() {
    }

    public Bohater(String _imie, Tarcza tarcza, Miecz miecz, Zasobnik zasobnik) {
        this._imie = _imie;
        this._tarcza = tarcza;
        this._miecz = miecz;
        this._zasobnik = zasobnik;
    }

    public String printAll() {
        System.out.printf("%s %s", _imie, _tarcza);
        return "";
    }

    public Tarcza getTarcza() {
        return _tarcza;
    }

    public void setImie(String imie) {
        this._imie = imie;
    }

    public String getImie() {
        return _imie;
    }


}
