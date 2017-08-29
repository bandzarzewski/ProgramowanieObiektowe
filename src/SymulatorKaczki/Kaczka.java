package SymulatorKaczki;


public abstract class Kaczka {
    protected ILatanie latanie_1;
    protected IKwakanie kwakanie;

    public void plywaj() {
        System.out.println("Swam swam i plywamy  ");
    }

    public void print() {
        System.out.println("Wysietl płaskonosa");
    }

    public void wykonajLatanie() {
        setLatanie_1(latanie_1);
    }

    public void wykonajKwakanie() {
        kwakanie.kwak(); // "kwakanie" to jest Interface a "kwak" to jest metoda
    }

    public void setLatanie_1(ILatanie latanie) {
        this.latanie_1 = latanie;
    }

    public void setKwakanie(IKwakanie kwakanie) {
        this.kwakanie = kwakanie;
    }
}
