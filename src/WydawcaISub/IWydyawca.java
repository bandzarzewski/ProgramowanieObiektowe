package WydawcaISub;

public interface IWydyawca {
    void dodajPrenumeratora(IOdbiorca prenumerator);

    void usunPrenumeratora(IOdbiorca prenumerator);

    void wyslijNowyNumer();
}