package SymulatorSklepIntObliczaniePodatkuWStrategia;

import java.util.ArrayList;

/**
 * Created by Maciek on 29.08.2017.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<IProdukty> products = new ArrayList<>();
        products.add(new Produkt1());
        products.add(new Produkt1());
        products.add(new Produkt3());

        ITax plTax = new TaxPol();
        ITax czTax = new TaxCzech();
        ITax usaTax = new TaxUsa();
        ITax gerTax = new TaxGer();

        Klient calc = new Klient(plTax, products);

    }
}
