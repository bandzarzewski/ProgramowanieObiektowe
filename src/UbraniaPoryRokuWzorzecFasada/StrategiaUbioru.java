package UbraniaPoryRokuWzorzecFasada;

public class StrategiaUbioru {
    private IUbranieNaKazdaPoreRoku _ubranieNaPoreRoku;

    public StrategiaUbioru(IUbranieNaKazdaPoreRoku ubranieNaPoreRoku) {
        _ubranieNaPoreRoku = ubranieNaPoreRoku;
    }

    public void ubieramySie() {
        _ubranieNaPoreRoku.ubierz();
    }

    public void rozbierzSie() {
        _ubranieNaPoreRoku.rozbierz();
    }

    public void setPoryRoku(IUbranieNaKazdaPoreRoku ubranieNaPoreRoku) {
        _ubranieNaPoreRoku = ubranieNaPoreRoku;
    }
}
