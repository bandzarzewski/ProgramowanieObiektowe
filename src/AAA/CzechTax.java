package AAA;

public class CzechTax implements ITax {
    @Override
    public double calculateBruttoPrice(double price) {
        return price + price * 0.1;
    }

    @Override
    public String getCountryCode() {
        return "Cz-cz";
    }
}
