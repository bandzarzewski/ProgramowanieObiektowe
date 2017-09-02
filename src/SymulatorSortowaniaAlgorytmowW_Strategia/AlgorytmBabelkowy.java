package SymulatorSortowaniaAlgorytmowW_Strategia;


public class AlgorytmBabelkowy implements ISortowanie {


    @Override
    public int[] sortowanieTab(int[] tab) {

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[i] <= tab[j]) {
                    //SWAP
                    int temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }
        }
        return tab;
    }

}
