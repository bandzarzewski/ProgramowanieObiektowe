package AAA;

public class USATax implements ITax {
    @Override
    public double calculateBruttoPrice(double price) {
        return price + price * 0.15;
    }

    @Override
    public String getCountryCode() {
        return "EN-us";
    }
}
