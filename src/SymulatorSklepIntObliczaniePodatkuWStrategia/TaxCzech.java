package SymulatorSklepIntObliczaniePodatkuWStrategia;


public class TaxCzech implements ITax {

    @Override
    public double calculateBruttoPrice(double price) {
        price += price * 10 / 100;
        return price;
    }

    @Override
    public String getCountryCode() {
        return "TaxCzech";
    }
}
