package SymulatorSklepIntObliczaniePodatkuWStrategia;


public class Produkt1 implements IProdukty {
    String _name;
    public double _priceNetto;
    public String _number;

    // Konstruktor
    public Produkt1() {
        _name = "Komputer osobisty";
        _priceNetto = 1650;
        _number = "E23x";
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public double getPriceNetto() {
        return _priceNetto;
    }

    @Override
    public String getNumber() {
        return _number;
    }
}
