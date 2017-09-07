package Pow0109.Zad1Strategia;


public class Main {
    public static void main(String[] args) {
        KlasaGlowna klasaGlowna = new KlasaGlowna(new Parzyste());
        int[] tabToSort = {3, 6, 1, 9, 14, 15};
        int[] sorted = klasaGlowna.uruchomProgram(tabToSort);
        for (int element : sorted) {
            System.out.println(element);
        }
    }
}
