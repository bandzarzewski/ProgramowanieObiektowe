package SymulatorKaczkiW_Strategia;

/**
 * Created by RENT on 2017-08-28.
 */
public class KaczkaModel extends Kaczka {
    public KaczkaModel() {
        _latanie = new LatamZNapedemOdrzutowym();
        kwakanie = new NieKwacz();

    }

    @Override
    public void print() {
        System.out.println("Wyglada jak super kaczka z silnikiem rakietowym");
    }
}
