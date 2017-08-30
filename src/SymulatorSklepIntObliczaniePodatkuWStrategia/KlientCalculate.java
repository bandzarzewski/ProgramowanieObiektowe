package SymulatorSklepIntObliczaniePodatkuWStrategia;

import java.util.List;

public class KlientCalculate {

    // Deklarujemy interface
    protected ITax _iTax;
    protected List<IProdukty> _iProdukty;

    // Konstruktor

    public KlientCalculate(ITax Tax, List<IProdukty> Produkty) {
        this._iProdukty = Produkty;
        this._iTax = Tax;
    }

    // Metody
    // obliczamy cenne brutto dla kazdego produktu.

    public double calculateBruttoPrice() {
        double priceBrutto = 0.0;
        for (IProdukty produkty : _iProdukty) {
            priceBrutto += _iTax.calculateBruttoPrice(produkty.getPriceNetto());
        }
        return priceBrutto;
    }

    public void showNettoAndBruttoPrice() {
        System.out.println(_iTax.getCountryCode()); // wyswietlam Stringa z nazwa podatku
        for (IProdukty produkty : _iProdukty) {
            System.out.printf("%s : Netto %.2f ,Brutto %.2f\n", produkty.getName(), produkty.getPriceNetto(), _iTax
                    .calculateBruttoPrice(produkty.getPriceNetto()));
        }
    }

    public void setITax(ITax tax) {
        this._iTax = tax;
    }
}
