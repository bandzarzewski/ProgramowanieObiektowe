package SymulatorKaczkiW_Strategia;

/**
 * Created by RENT on 2017-08-28.
 */
public class KaczkaDzika extends Kaczka {
    public KaczkaDzika() {
        _latanie = new LatamBoMamSkrzydła();
        kwakanie = new Kwacz();
    }


    @Override
    public void print() {
        System.out.println("Wysietl dzika kaczke ");
    }
}
