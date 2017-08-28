package SymulatorSortowaniaAlgorytmow;

/**
 * Created by RENT on 2017-08-28.
 */
public class Main {
    public static void main(String[] args) {
        // int[] tab = new int[]{9, 14, 1, 27, 7, 25};

        TablicaLiczb tablicaLiczb = new TablicaLiczb(new AlgorytmBabelkowy());
        int[] tabToSort = {3, 87, 2, 8, 9};
        int[] sorted = tablicaLiczb.doSorting(tabToSort);
        for (int element : sorted) {
            System.out.println(element);
        }

    }
}
