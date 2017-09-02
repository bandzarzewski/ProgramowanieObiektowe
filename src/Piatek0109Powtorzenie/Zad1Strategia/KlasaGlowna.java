package Piatek0109Powtorzenie.Zad1Strategia;

public final class KlasaGlowna {
    protected IAlgorytm _iAlgorytm;

    public KlasaGlowna(IAlgorytm iAlgorytm) {
        this._iAlgorytm = iAlgorytm;
    }

    public void setAlgorytm(IAlgorytm Algorytm) {
        this._iAlgorytm = Algorytm;
    }

    public int[] uruchomProgram(int[] tablica) {
        return _iAlgorytm.uruchom(tablica);
    }

}
