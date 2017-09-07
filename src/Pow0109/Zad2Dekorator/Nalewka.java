package Pow0109.Zad2Dekorator;

public abstract class Nalewka {
    protected String opis;
    protected int alkohol;

    public String pobierzOpis() {
        return opis;
    }

    public abstract int alkohol();
}
