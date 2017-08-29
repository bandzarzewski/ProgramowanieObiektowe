package SymulatorSklepIntObliczaniePodatkuWStrategia;


public class TaxUsa implements ITax {

    @Override
    public double calculateBruttoPrice(double price) {
        price = price * 15 / 100;
        return price;
    }
}
