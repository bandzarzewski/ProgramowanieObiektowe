package TypGeneryczny.ZadFruit;


public class FruitBasket<T extends IFruit> {
    private T _owoc;

    public T getOwoc() {
        return _owoc;
    }

    public void setOwoc(T owoc) {
        this._owoc = owoc;
    }

    public String getName() {
        return _owoc.getName();
    }

    public String getColor() {
        return _owoc.getColor();
    }


}
