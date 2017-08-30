package AAA;

import java.util.List;

public class Calculator {
    private List<IProduct> _productList;
    private ITax _tax;

    public Calculator(List<IProduct> productList, ITax tax) {
        _productList = productList;
        _tax = tax;
    }

    public double calculateBruttoValueForAllProducts() {
        double bruttoPrice = 0.0;
        for (IProduct product : _productList) {
            bruttoPrice += _tax.calculateBruttoPrice(product.getNettoPrice());
        }
        return bruttoPrice;
    }

    public void showBasketWithProductsNettoAndBrutto() {
        System.out.println(_tax.getCountryCode());
        for (IProduct product : _productList) {
            System.out.printf("%s :: %.2f :: %.2f\n", product.getName(), product.getNettoPrice(),
                    _tax.calculateBruttoPrice(product.getNettoPrice()));
        }
    }

    public void setTax(ITax tax) {
        _tax = tax;
    }
}
