package WydawcaISubW_Obserwator;

public interface IWydawca {
    void dodajPrenumeratora(IOdbiorca prenumerator);

    void usunPrenumeratora(IOdbiorca prenumerator);

    void wyslijNowyNumer();
}
