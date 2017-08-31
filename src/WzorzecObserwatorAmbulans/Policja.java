package WzorzecObserwatorAmbulans;

// Obiekt który obserwuje

public class Policja implements ICentrumZgloszen {

    private IOperator _numerZgloszenia;

    public Policja(IOperator numerZgloszenia) {
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

}
