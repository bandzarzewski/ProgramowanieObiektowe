package GraRpgWzorzecDekorator;

public abstract class Zasobnik {
    protected String opis;

    public String pobierzOpis() {
        return opis;
    }

    public abstract int pojemnosc();

}
