package WydawcaISubW_Obserwator;

// IObserwator który obserwuje gazete

public class Maciek implements IOdbiorca {
    private IWydawca _gazeta;

    public Maciek(IWydawca gazeta) {
        zaprenumerujGazete(gazeta);
    }

    @Override
    public void odbierzGazete(String numer) {
        System.out.printf("Jest nowy numer gazety %s\n", numer);
    }

    public void rezygnacjaZGazety() {
        _gazeta.usunPrenumeratora(this);
    }

    public void zaprenumerujGazete(IWydawca gazeta) {
        _gazeta = gazeta;
        _gazeta.dodajPrenumeratora(this);

    }
}
