package Piatek0109Powtorzenie.Zad4Fasada;


public class FasadaZiola {
    private Cukier _cukier;
    private TalkDlaDzieci _talk;
    private Ziola _ziola;

    public FasadaZiola(Cukier cukier, TalkDlaDzieci talk, Ziola ziola) {
        this._cukier = cukier;
        this._talk = talk;
        this._ziola = ziola;
    }

    public void zrobZiola() {
        _ziola.dodajZiola();
        _cukier.dodajCukier();
        _ziola.mieszajZiola();
        _talk.dodajTalk();
        _cukier.dodajCukier();
        _cukier.odejmijCukier();
        _ziola.mieszajZiola();
        _ziola.kompresujZiola();
    }


}
