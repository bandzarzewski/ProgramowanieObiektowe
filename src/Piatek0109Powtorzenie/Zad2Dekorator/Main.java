package Piatek0109Powtorzenie.Zad2Dekorator;


public class Main {
    public static void main(String[] args) {
        CzystySpirytus czystySpirytus = new CzystySpirytus();
        CzystaWoda czystaWoda = new CzystaWoda(czystySpirytus);

        System.out.printf("Nazwa: %s :: Alkohol:  %d \n", czystaWoda.pobierzOpis(), czystaWoda.alkohol());

    }
}
