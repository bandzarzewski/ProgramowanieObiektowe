package GraRpgWzorzecDekorator;

/**
 * Created by Maciek on 01.09.2017.
 */
public class ZasobnikRozmiarM extends Zasobnik {

    ZasobnikRozmiarM() {
        opis = " Zasobnik rozmiar M";
    }

    @Override
    public int pojemnosc() {
        return 8;
    }
}
