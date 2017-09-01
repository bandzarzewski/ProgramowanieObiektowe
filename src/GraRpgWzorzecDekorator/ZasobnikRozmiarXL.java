package GraRpgWzorzecDekorator;


public class ZasobnikRozmiarXL extends Zasobnik {

    ZasobnikRozmiarXL() {
        opis = " Zasobnik rozmiar XL";
    }

    @Override
    public int pojemnosc() {
        return 10;
    }
}
