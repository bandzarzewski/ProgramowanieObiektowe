package GraRpgWzorzecDekorator;

public class OsłonaDloni extends DodatkoweElementyMiecza {

    Miecz miecz;

    @Override
    public String pobierzOpis() {
        return miecz.pobierzOpis() + " Tytanowa osłona reki ";
    }

    @Override
    public int obrona() {
        return miecz.obrona() + 15;
    }
}
