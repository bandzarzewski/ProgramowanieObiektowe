package SymulatorSklepIntObliczaniePodatkuWStrategia;

import java.util.ArrayList;

/**
 * Created by Maciek on 29.08.2017.
 */
public class Main {
    public static void main(String[] args) {

        // Dodajemu do listy cztery produkty.
        ArrayList<IProdukty> products = new ArrayList<>();
        products.add(new Produkt1());
        products.add(new Produkt1());
        products.add(new Produkt3());

        // Tworzymy nowe obiekty podatek.
        ITax plTax = new TaxPol();
        ITax czTax = new TaxCzech();
        ITax usaTax = new TaxUsa();
        ITax gerTax = new TaxGer();


        KlientCalculate calc = new KlientCalculate(plTax, products);

        calc.showNettoAndBruttoPrice();
        calc.setITax(usaTax);
        calc.showNettoAndBruttoPrice();

    }
}
