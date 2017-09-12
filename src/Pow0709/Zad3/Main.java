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


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Wprowadz liczbe: ");
        int liczba = sc.nextInt();

        for (int i = 0; i < liczba; i++) {
            int nowaLiczba = random.nextInt(201) - 100; // zakres od -100 do 100

            if (nowaLiczba > 0) {
                System.out.println("Liczba dodatnia: " + nowaLiczba);
            } else if (nowaLiczba < 0) {
                System.out.println("Liczba ujemna: " + nowaLiczba);
            }
        }
    }
}


//        try {
//            System.out.println("Wprowadz liczbę z zakresu od -100 do 100 ");
//
//            if (liczba >= -100 && liczba <= 100) {
//                liczba += liczba;
//                System.out.println(liczba);
//
//
//            } else if (liczba < -100 || liczba > 100) {
//                throw new NumberFormatException();
//            }
//
//        } catch (NumberFormatException ex) {
//            System.out.println("Wprowadziłeś liczbe spoza zakresu ! ");
//            sc.nextLine();
//        }