package WydawcaISub;


public class Maciek implements IOdbiorca {
    private IWydyawca _gazeta;

    public Maciek(IWydyawca gazeta) {
        zaprenumerujGazete(gazeta);
    }

    @Override
    public void odbierzGazete(String numer) {
        System.out.printf("Jest nowy numer gazety %s\n", numer);
    }

    public void rezygnacjaZGazety() {
        _gazeta.usunPrenumeratora(this);
    }

    public void zaprenumerujGazete(IWydyawca gazeta) {
        _gazeta = gazeta;
        _gazeta.dodajPrenumeratora(this);

    }
}
