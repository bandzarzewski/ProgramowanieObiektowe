package SymulatorSklepIntObliczaniePodatkuWStrategia;

import java.util.List;

/**
 * Created by Maciek on 29.08.2017.
 */
public class Klient {

    // Deklarujemy interface
    protected ITax _iTax;
    protected List<IProdukty> _iProdukty;

    // Konstruktor

    public Klient(ITax Tax, List<IProdukty> Produkty) {
        this._iProdukty = Produkty;
        this._iTax = Tax;
    }

    // Metody
    public double calculateBruttoPrice() {
        double priceBrutto = 0.0;
        for (IProdukty produkty : _iProdukty) {
            priceBrutto += _iTax.calculateBruttoPrice(produkty.getPriceNetto());
        }
        return priceBrutto;
    }
}
