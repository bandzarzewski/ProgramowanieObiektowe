package SymulatorKaczkiW_Strategia;

public abstract class Kaczka {
    protected ILatanie _latanie;
    protected IKwakanie kwakanie;

    public void plywaj() {
        System.out.println("Swam swam i plywamy  ");
    }

    public void print() {
        System.out.println("Wysietl płaskonosa");
    }

    public void wykonajLatanie() {
        set_latanie(_latanie);
    }

    public void wykonajKwakanie() {
        kwakanie.kwak(); // "kwakanie" to jest Interface a "kwak" to jest metoda
    }

    public void set_latanie(ILatanie latanie) {
        this._latanie = latanie;
    }

    public void setKwakanie(IKwakanie kwakanie) {
        this.kwakanie = kwakanie;
    }
}
