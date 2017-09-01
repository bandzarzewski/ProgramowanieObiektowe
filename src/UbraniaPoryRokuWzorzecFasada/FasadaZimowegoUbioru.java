package UbraniaPoryRokuWzorzecFasada;

/**
 * Created by RENT on 2017-08-31.
 */
public class FasadaZimowegoUbioru implements IUbranieNaKazdaPoreRoku {
    Sandaly _sandaly;
    Skarpetki _skarpetki;

    public FasadaZimowegoUbioru(Sandaly _sandaly, Skarpetki _skarpetki) {
        this._sandaly = _sandaly;
        this._skarpetki = _skarpetki;
    }

    @Override
    public void ubierz() {

    }

    @Override
    public void rozbierz() {

    }
}
