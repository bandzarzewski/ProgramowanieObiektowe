package SymulatorSklepIntObliczaniePodatkuWStrategia;


public interface ITax {
    double calculateBruttoPrice(double price);

    String getCountryCode();

}
