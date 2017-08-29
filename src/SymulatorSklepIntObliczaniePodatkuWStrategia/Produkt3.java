package SymulatorSklepIntObliczaniePodatkuWStrategia;


public class Produkt3 implements IProdukty {
    String _name;
    public double _priceNetto;
    public String _number;

    public Produkt3() {
        _name = "Samochód";
        _priceNetto = 65000;
        _number = "Al875";
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
