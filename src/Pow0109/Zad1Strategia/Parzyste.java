package Pow0109.Zad1Strategia;

public class Parzyste implements IAlgorytm {
    @Override
    public int[] uruchom(int[] tablica) {
        int[] tablica1 = new int[tablica.length];
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] % 2 == 0) {
                tablica1[i] = tablica[i];
            }
        }
        return tablica1;


    }
}
