package AAA;

public class UseYourIllusion implements IProduct {
    private String _name;
    public double _nettoPrice;

    public UseYourIllusion() {
        _name = "Use Your Illusion vol 1 and 2";
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
