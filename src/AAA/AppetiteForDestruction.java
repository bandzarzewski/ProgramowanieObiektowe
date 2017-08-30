package AAA;

public class AppetiteForDestruction implements IProduct {
    private String _name;
    public double _nettoPrice;

    public AppetiteForDestruction() {
        _name = "Appetite for destruction";
        _nettoPrice = 18.99;
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public double getNettoPrice() {
        return _nettoPrice;
    }
}
