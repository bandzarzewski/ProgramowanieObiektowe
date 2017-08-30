package SymulatorKaczkiW_Strategia;

/**
 * Created by RENT on 2017-08-28.
 */
public class KaczkaWabik extends Kaczka {

    public KaczkaWabik() {
        _latanie = new NieLatam();
        kwakanie = new NieKwacz();
    }

    @Override
    public void print() {
        System.out.println("Wyglada jak kaczka wabik");
    }
}

