package TypGeneryczny;

public class Shirt extends Clothes implements ICanBeFolded {
    @Override
    public String getDescription() {
        return "Fajne koszulki";
    }

    @Override
    public String getName() {
        return "koszulki";
    }

    @Override
    public String getSize() {
        return "M";
    }


}
