package Piatek0109Powtorzenie.Zad2Dekorator;


public class SokWisniowy extends NalewkaDekorator {

    private Nalewka _nalewka;

    public SokWisniowy(Nalewka nalewka) {
        this._nalewka = nalewka;
    }

    @Override
    public String pobierzOpis() {
        return _nalewka.pobierzOpis() + "Sok Wisniowy";
    }

    @Override
    public int alkohol() {
        return 0;
    }
}
