package AAA;

public class ChineseDemocracy implements IProduct {
    private String _name;
    public double _nettoPrice;

    public ChineseDemocracy() {
        _name = "ChineseDemocracy";
        _nettoPrice = 13.99;
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
