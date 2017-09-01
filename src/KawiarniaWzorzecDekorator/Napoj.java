package KawiarniaWzorzecDekorator;


public abstract class Napoj {
    protected String opis;

    public String pobierzOpis() {
        return opis;
    }

    public abstract double koszt(); // kazda która dzidziczy po tej klasie musi sama zaimplementować ta metode

}
