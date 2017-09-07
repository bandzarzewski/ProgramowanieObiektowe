package Pow0109.Zad2Dekorator;


public class SokMalinowy extends NalewkaDekorator {

    private Nalewka _nalewka;

    public SokMalinowy(Nalewka nalewka) {
        this._nalewka = nalewka;
    }

    @Override
    public String pobierzOpis() {
        return _nalewka.pobierzOpis() + "Sok Malinowy";
    }

    @Override
    public int alkohol() {
        return 0;
    }
}
