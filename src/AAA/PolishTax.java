package AAA;

public class PolishTax implements ITax {
    @Override
    public double calculateBruttoPrice(double price) {
        return price + price * 0.23;
    }

    @Override
    public String getCountryCode() {
        return "PL-pl";
    }
}
