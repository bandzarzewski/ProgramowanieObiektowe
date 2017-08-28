package SymulatorKaczki;

/**
 * Created by RENT on 2017-08-28.
 */
public class KaczkaModel extends Kaczka {
    public KaczkaModel() {
        latanie_1 = new LatamZNapedemOdrzutowym();
        kwakanie = new NieKwacz();

    }

    @Override
    public void print() {
        System.out.println("Wyglada jak super kaczka z silnikiem rakietowym");
    }
}
