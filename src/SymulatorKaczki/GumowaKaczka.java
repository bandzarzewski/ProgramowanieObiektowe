package SymulatorKaczki;


public class GumowaKaczka extends Kaczka {
    public GumowaKaczka() {
        latanie_1 = new NieLatam();
        kwakanie = new Piszcz();
    }


    @Override
    public void print() {
        System.out.println("Wyglada jak gumowa kaczka");
    }


}
