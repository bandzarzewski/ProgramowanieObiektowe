package SymulatorKaczkiW_Strategia;


public class GumowaKaczka extends Kaczka {
    public GumowaKaczka() {
        _latanie = new NieLatam();
        kwakanie = new Piszcz();
    }


    @Override
    public void print() {
        System.out.println("Wyglada jak gumowa kaczka");
    }


}
