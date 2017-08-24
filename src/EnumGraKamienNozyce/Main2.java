package EnumGraKamienNozyce;

import java.util.Scanner;

/**
 * Created by RENT on 2017-08-24.
 */
public class Main2 {
    public enum decisonUser {YES, NO}

    public enum Gra {KAMIEN, NOZYCE, PAPIER}  // k-KAMIEN, n-NOZYCE, p-PAPIER ,Q-koniec

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz Y ");
        String wartosc = sc.nextLine();
        decisonUser userdecision;
        if (wartosc.equals("y")) {
            userdecision = decisonUser.YES;

            System.out.println("Grasza dalej i wprowadz kolejny znak (k, n, p)");
            String wartosc2 = sc.nextLine();
            wartosc2 = wartosc2.toUpperCase();
            Gra decyzjauzytkownika;
            if (wartosc2.equals("k")) {
                decyzjauzytkownika = Gra.KAMIEN;

            } else if (wartosc2.equals("n")) {
                decyzjauzytkownika = Gra.NOZYCE;
            } else if (wartosc2.equals("p")) {
                decyzjauzytkownika = Gra.PAPIER;
            }

        } else {
            userdecision = decisonUser.NO;
            System.out.println("Koniec Gry");

        }

    }
}
