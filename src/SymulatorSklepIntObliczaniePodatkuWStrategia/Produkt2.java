package SymulatorSklepIntObliczaniePodatkuWStrategia;


public class Produkt2 implements IProdukty {
    String _name;
    public double _priceNetto;
    public String _number;

    public Produkt2() {
        _name = "Biurko drewniane";
        _priceNetto = 550;
        _number = "mv_47";
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
