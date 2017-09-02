package SymulatorSortowaniaAlgorytmowW_Strategia;


public final class TablicaLiczb { // klasa finalna, po niej nic juz nie dziedziczy
    protected ISortowanie _Sortowanie; // interface

    // Konstruktor
    public TablicaLiczb(ISortowanie sortowanie) {
        setSortowanie(sortowanie);
    }

    public void setSortowanie(ISortowanie sortowanie) {
        this._Sortowanie = sortowanie;
    }

    public int[] doSorting(int[] toSort) {
        return _Sortowanie.sortowanieTab(toSort);

        // [nazwaInterface].[metodaWInterface]
    }


}
