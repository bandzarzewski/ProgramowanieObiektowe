package Fasada;


public class FasadaKinaDomowego {
    private Telewizor _telewizor;
    private TermoMix _termoMix;
    private Wzmacniacz _wzmacniacz;

    public FasadaKinaDomowego(Telewizor tv, TermoMix tMix, Wzmacniacz wzm) {
        this._telewizor = tv;
        this._termoMix = tMix;
        this._wzmacniacz = wzm;
    }

    public void wrocDoDomu() {
        _wzmacniacz.wlacz();
        _telewizor.wlacz();
        _telewizor.ustawGlosnosc();
        _telewizor.ustawKanal();
        _termoMix.wlacz();
        _termoMix.zrobObiad();
    }

    public void wyjdzZDomu() {
        _wzmacniacz.wylacz();
        _telewizor.wylacz();
        _termoMix.wlacz();
    }
}
