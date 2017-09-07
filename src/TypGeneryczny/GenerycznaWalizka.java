package TypGeneryczny;

public class GenerycznaWalizka<T extends Clothes & ICanBeFolded> {
    private T _przedmiot;


    public void setPrzedmiot(T przedmiot) {
        this._przedmiot = przedmiot;
    }

    public T getPrzedmiot() {
        return _przedmiot;
    }

    public String getThingName() {
        return _przedmiot.getName();
    }

    public String getThingDescription() {
        return _przedmiot.getDescription();
    }

    public String getThingSize() {
        return _przedmiot.getSize();
    }
}
