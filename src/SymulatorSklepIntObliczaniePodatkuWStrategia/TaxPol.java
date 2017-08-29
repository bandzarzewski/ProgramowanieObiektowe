package SymulatorSklepIntObliczaniePodatkuWStrategia;

/**
 * Created by Maciek on 29.08.2017.
 */
public class TaxPol implements ITax {

    @Override
    public double calculateBruttoPrice(double price) {
        price = price * 23 / 100;
        return price;
    }
}
