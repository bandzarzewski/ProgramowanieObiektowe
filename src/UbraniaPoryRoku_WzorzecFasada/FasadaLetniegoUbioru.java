package UbraniaPoryRoku_WzorzecFasada;

public class FasadaLetniegoUbioru implements IUbranieNaKazdaPoreRoku {

    Sandaly _sandaly;
    Skarpetki _skarpetki;

    public FasadaLetniegoUbioru(Sandaly san, Skarpetki ska) {
        _sandaly = san;
        _skarpetki = ska;

    }

    @Override
    public void ubierz() {
        _sandaly.ubierzUbrania();
        _skarpetki.ubierzUbrania();
    }

    @Override
    public void rozbierz() {
        _sandaly.rozbierzUbrania();
        _skarpetki.rozbierzUbrania();
    }
}
