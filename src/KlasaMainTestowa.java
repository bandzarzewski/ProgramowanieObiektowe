import java.util.Scanner;

public class KlasaMainTestowa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz wielkosc tablicy");
        int n = sc.nextInt();
        int[] tab = new int[n];

        System.out.println("Wprowadz elementy tablicy");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = sc.nextInt();
        }

        int temp = 0;
        int numOfSwaps = 0;
        for (int j = 0; j < tab.length; j++) {
            for (int k = 0; k < tab.length - 1; k++) {
                if (tab[k] > tab[k + 1]) {
                    temp = tab[k];
                    tab[k] = tab[k + 1];
                    tab[k + 1] = temp;
                    numOfSwaps++;
                }
            }
        }
//        for (int j = 0; j < tab.length; j++) {
//            System.out.print(tab[j] + " ");
//        }
        
        System.out.println();
        System.out.println("Array is sorted in " + numOfSwaps + " swaps");
        System.out.println("First Element: " + tab[0]);
        System.out.println("Last Element : " + tab[tab.length - 1]);
    }
}
