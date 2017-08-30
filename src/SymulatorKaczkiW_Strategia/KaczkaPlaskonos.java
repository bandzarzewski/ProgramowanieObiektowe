package SymulatorKaczkiW_Strategia;

/**
 * Created by RENT on 2017-08-28.
 */
public class KaczkaPlaskonos extends Kaczka {
    // Konstruktor
    public KaczkaPlaskonos() {
        _latanie = new LatamBoMamSkrzydła();
        kwakanie = new Kwacz();
    }

    @Override
    public void print() {
        System.out.println("Wysietl płaskonosa");

    }
}
