package AAA;

public class GermanTax implements ITax {

    @Override
    public double calculateBruttoPrice(double price) {
        return price + price * 0.3;
    }

    @Override
    public String getCountryCode() {
        return "DE-de";
    }
}
