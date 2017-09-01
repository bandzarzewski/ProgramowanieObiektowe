package GraRpgWzorzecDekorator;

public class WiazkaLasera extends DodatkoweElementyMiecza {
    Miecz miecz;

    @Override
    public String pobierzOpis() {
        return miecz.pobierzOpis() + " Zabójczy niebieski laser ";
    }

    @Override
    public int obrona() {
        return miecz.obrona() + 35;
    }
}
