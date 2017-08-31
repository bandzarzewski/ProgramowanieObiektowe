package GraRpgWzorzecDekorator;

public class Bohater {

    //Miecz miecz;
    //Plecak plecak;

    private String _imie;
    private Tarcza _tarcza;

    public Bohater() {
    }

    public Bohater(String _imie, Tarcza tarcza) {
        this._imie = _imie;
        this._tarcza = tarcza;
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
