package Pow0709.Zad3;

import java.util.Random;
import java.util.Scanner;
// LOSWANIE LICZB LOSOWYCH Z ZAKRESY
//Random rand = new Random();
//        int a = rand.nextInt(y - x + 1) + x;
//class RandomNumbers {
//    public static void main(String[] args) {
//        int c;
//        Random t = new Random();
//
//        // random integers in [0, 100]
//
//        for (c = 1; c <= 10; c++) {
//            System.out.println(t.nextInt(100));
//        }
//    }
//}

// UZYJ LICZNIKA
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz liczbe: ");
        int liczba = sc.nextInt();
        int licznik = 0;
        int licznik2 = 0;
        int max = 0;
        int min = 0;
        for (int i = 0; i < liczba; i++) {
            int nowaLiczba = random.nextInt(201) - 100; // zakres od -100 do 100
            if (nowaLiczba > 0) {
                licznik++;
                System.out.println(nowaLiczba);
            }

            if (nowaLiczba < 0) {
                licznik2++;
                System.out.println(nowaLiczba);
            }

            if (nowaLiczba > max) {
                max = nowaLiczba;
            }

            if (nowaLiczba < min) {
                min = nowaLiczba;
            }
            
        }
        System.out.println("Liczba dodatnich czyfr : " + licznik);
        System.out.println("Liczba ujemnych czyfr : " + licznik2);
        double a = ((double) licznik / (double) licznik2);
        System.out.println("Stosunek liczb dodatnich do ujemnych:  " + a);
        System.out.println("Min: " + min + " Max: " + max);
    }
}

