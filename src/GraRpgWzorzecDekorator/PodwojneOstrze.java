package GraRpgWzorzecDekorator;

/**
 * Created by Maciek on 01.09.2017.
 */
public class PodwojneOstrze extends DodatkoweElementyMiecza {
    Miecz miecz;

    @Override
    public String pobierzOpis() {
        return miecz.pobierzOpis() + " Podwójne chirurgiczne ostrze";
    }

    @Override
    public int obrona() {
        return miecz.obrona() + 60;
    }
}
