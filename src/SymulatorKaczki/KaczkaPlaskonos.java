package SymulatorKaczki;

/**
 * Created by RENT on 2017-08-28.
 */
public class KaczkaPlaskonos extends Kaczka {
    // Konstruktor
    public KaczkaPlaskonos() {
        latanie_1 = new LatamBoMamSkrzydła();
        kwakanie = new Kwacz();
    }

    @Override
    public void print() {
        System.out.println("Wysietl płaskonosa");

    }
}
