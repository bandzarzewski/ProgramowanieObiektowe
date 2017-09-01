package Piatek0109Powtorzenie.Zad2Dekorator;

public abstract class Nalewka {
    protected String opis;
    int alkohol;

    public String pobierzOpis() {
        return opis;
    }

    public abstract int alkohol();
}
