package TypGeneryczny;


public class Rower extends Clothes {
    private String _name;

    public Rower() {
        this._name = "Zosia";
    }

    @Override
    public String getDescription() {
        return null;
    }

    public String getName() {
        return _name;
    }

    @Override
    public String getSize() {
        return null;
    }
}
