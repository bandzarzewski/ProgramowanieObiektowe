package Kolekcje;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) throws InterruptedException {

        //  zad.1
        int[] tablica1 = new int[10];
        for (int i = 1; i < 10; i++) {
            tablica1[i] = i;
        }
        System.out.println("Tablica int");
        for (int i = 1; i < tablica1.length; i++) {
            System.out.print(tablica1[i] + " ");
        }

        Integer[] tablica2 = new Integer[10];
        for (int i = 1; i < tablica2.length; i++) {
            tablica2[i] = i;
        }
        System.out.println();
        System.out.println("Tablica Integer");
        for (int i = 1; i < tablica2.length; i++) {
            System.out.print(tablica2[i] + " ");
        }

        Integer[] tablica3 = new Integer[]{24, 7, 8, 3, 8, 2};

        List lista1 = Arrays.asList(tablica1);
        List<Integer> lista2 = Arrays.asList(tablica2);
        List<Integer> Lista3 = Arrays.asList(tablica3);
        System.out.println();
        System.out.println("HashCode");
        System.out.println(lista2.hashCode());

        Instant ins = Instant.now();
        System.out.println(ins.hashCode());
        Thread.sleep(1500);
        ins = Instant.now();
        System.out.println(ins.hashCode());


    }
}
