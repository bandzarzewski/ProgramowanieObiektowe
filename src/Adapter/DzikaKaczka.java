package Adapter;


public class DzikaKaczka implements IKaczka {
    @Override
    public void kwacz() {
        System.out.println("Kwa kwa kwa ... ");
    }

    @Override
    public void lataj() {
        System.out.println(" Fru Fru fri .. ");
    }
}
