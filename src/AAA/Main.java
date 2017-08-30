package AAA;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IProduct> products = new ArrayList<>();
        products.add(new ChineseDemocracy());
        products.add(new AppetiteForDestruction());
        products.add(new UseYourIllusion());

        ITax plTax = new PolishTax();
        ITax deTax = new GermanTax();
        ITax usaTax = new USATax();
        ITax czTax = new CzechTax();

        Calculator calc = new Calculator(products, plTax);

        calc.showBasketWithProductsNettoAndBrutto();
        calc.setTax(deTax);
        calc.showBasketWithProductsNettoAndBrutto();
        calc.setTax(usaTax);
        calc.showBasketWithProductsNettoAndBrutto();

    }
}
