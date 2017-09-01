package Piatek0109Powtorzenie.Zad2Dekorator;

public class CzystaWoda extends NalewkaDekorator {

    Nalewka _nalewka;

    public CzystaWoda(Nalewka nalewka) {
        this._nalewka = nalewka;
    }

    @Override
    public String pobierzOpis() {
        return _nalewka.pobierzOpis() + "Czysta woda";
    }

    @Override
    public int alkohol() {
        return _nalewka.alkohol() - 8;
    }


}
