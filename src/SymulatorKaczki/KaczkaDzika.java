package SymulatorKaczki;

/**
 * Created by RENT on 2017-08-28.
 */
public class KaczkaDzika extends Kaczka {
    public KaczkaDzika() {
        latanie_1 = new LatamBoMamSkrzydła();
        kwakanie = new Kwacz();
    }


    @Override
    public void print() {
        System.out.println("Wysietl dzika kaczke ");
    }
}
