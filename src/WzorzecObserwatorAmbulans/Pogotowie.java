package WzorzecObserwatorAmbulans;


public class Pogotowie implements ICentrumZgloszen {

    private IOperator _numerZgloszenia;

    public Pogotowie(IOperator numerZgloszenia) {
        this._numerZgloszenia = numerZgloszenia;
        // tu można użyć metody "noweZgloszenie()"
    }

    @Override
    public void aktualizacja(String numerZglosznie) {
        System.out.printf("Uwaga jest nowe zgłoszenie %s \n", numerZglosznie);
    }

    public void rezygnacjaZeZgloszenia() {
        _numerZgloszenia.usunZgloszenie(this);
    }

    public void noweZgłoszenie(IOperator numerZgloszenia) {
        _numerZgloszenia = numerZgloszenia;
        _numerZgloszenia.zarejstrujZgloszenie(this);
    }

    public void jedzDoZgloszenie() {
        System.out.printf("Jade do zgłoszenie: %s", _numerZgloszenia);
    }
}

