package SymulatorSklepIntObliczaniePodatkuWStrategia;


public class TaxGer implements ITax {
    @Override
    public double calculateBruttoPrice(double price) {
        price += price * 30 / 100;
        return price;
    }

    @Override
    public String getCountryCode() {
        return "TaxGr";
    }
}
