package Piatek0109Powtorzenie.Zad2Dekorator;


public class Main {
    public static void main(String[] args) {
        CzystySpiryt czystySpiryt = new CzystySpiryt();
        CzystaWoda czystaWoda = new CzystaWoda(czystySpiryt);

        System.out.printf("Nazwa: %s :: Alkohol:  %d \n", czystaWoda.pobierzOpis(), czystaWoda.alkohol());

    }
}
