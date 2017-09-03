package SymulatorSortowaniaAlgorytmowW_Strategia;


public class AlgorytmPrzezZliczanie implements ISortowanie {


    @Override
    public int[] sortowanieTab(int[] tab) {

        int[] aux = new int[tab.length];

        // max i min element w tab.
        int min = tab[0];
        int max = tab[0];

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            } else if (tab[i] > max) {
                max = tab[i];
            }
        }
        int[] counts = new int[max - min + 1]; // dlugosc tablicy

        for (int i = 0; i < tab.length; i++) {
            counts[tab[i] - min]++;
        }

        counts[0]--;
        for (int i = 1; i < counts.length; i++) {   // Sumowanie : zaczynając
            // od drugiego licznika sumujemy zawartość licznika oraz jego poprzednika
            counts[i] = counts[i] + counts[i - 1];
        }

        for (int i = tab.length - 1; i >= 0; i--) {
            aux[counts[tab[i] - min]--] = tab[i];
        }
        tab = aux;
        return tab;
    }
}
