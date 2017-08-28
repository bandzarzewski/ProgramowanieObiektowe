package SymulatorKaczki;

/**
 * Created by RENT on 2017-08-28.
 */
public class KaczkaWabik extends Kaczka {

    public KaczkaWabik() {
        latanie_1 = new NieLatam();
        kwakanie = new NieKwacz();
    }

    @Override
    public void print() {
        System.out.println("Wyglada jak kaczka wabik");
    }
}

