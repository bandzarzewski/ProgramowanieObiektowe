package GraRpgWzorzecDekorator;


public class ZasobnikRozmiarS extends Zasobnik {


    ZasobnikRozmiarS() {
        opis = " Zasobnik rozmiar S";
    }

    @Override
    public int pojemnosc() {
        return 5;
    }
}
