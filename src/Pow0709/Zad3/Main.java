package Pow0709.Zad3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Wprowadz liczbę z zakresu od -100 do 100 ");
            int liczba = sc.nextInt();
            if (liczba >= -100 && liczba <= 100) {
                liczba += liczba;
                System.out.println(liczba);


            } else if (liczba < -100 || liczba > 100) {
                throw new NumberFormatException();
            }

        } catch (NumberFormatException ex) {
            System.out.println("Wprowadziłeś liczbe spoza zakresu ! ");
            sc.nextLine();
        }
    }
}
