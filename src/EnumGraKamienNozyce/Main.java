package EnumGraKamienNozyce;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-08-24.
 */

public class Main {
    public enum FiguraWGrze {KAMIEN, NOZYCE, PAPIER, Q}

    public enum StatusGry {REMIS, WYGRANA, PRZEGRANA}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tworzymy dwóch graczy i przypsiujemy wartości domyślne
        FiguraWGrze user = FiguraWGrze.KAMIEN;
        FiguraWGrze computer = FiguraWGrze.NOZYCE;


        // Licznik

        int remis = 0;
        int wygrana = 0;
        int przegrana = 0;
        int liczbaGier = 0;


        while (!user.equals(FiguraWGrze.Q)) { // jesli gracz nie wybierze Q gra dalej

            System.out.println("Podaj swoj znak: ");
            String decision = sc.nextLine();
            switch (decision.toLowerCase()) {
                case "n":
                    user = FiguraWGrze.NOZYCE;
                    break;
                case "k":
                    user = FiguraWGrze.KAMIEN;
                    break;
                case "p":
                    user = FiguraWGrze.PAPIER;
                    break;
                case "q":
                    user = FiguraWGrze.Q;
                default:
                    continue;
            }


            Random random = new Random(); // losujemy wawrtosc losowa

            switch (random.nextInt(3)) {
                case 0:
                    computer = FiguraWGrze.KAMIEN;
                    System.out.println("Komputer wybral Kamien \n");
                    break;
                case 1:
                    computer = FiguraWGrze.NOZYCE;
                    System.out.println("Komputer wybral Nozyce \n");
                    break;
                case 2:
                    computer = FiguraWGrze.PAPIER;
                    System.out.println("Komputer wybral Papier \n");
                    break;

            }

            StatusGry result = wynikiGry(user, computer);
            if (result.equals(StatusGry.REMIS))
                remis++;
            if (result.equals(StatusGry.PRZEGRANA))
                przegrana++;
            if (result.equals(StatusGry.WYGRANA))
                wygrana++;

            liczbaGier++;
        }
        System.out.println("Liczba gier: " + liczbaGier + "\n Wygrana:" + wygrana + "\n Przegrana" + przegrana + "\n Remis" + remis);
    }

    public static StatusGry wynikiGry(FiguraWGrze user, FiguraWGrze computer) {

        if (user.equals(FiguraWGrze.KAMIEN) && computer.equals(FiguraWGrze.KAMIEN))
            return StatusGry.REMIS;
        if (user.equals(FiguraWGrze.KAMIEN) && computer.equals(FiguraWGrze.NOZYCE))
            return StatusGry.WYGRANA;
        if (user.equals(FiguraWGrze.KAMIEN) && computer.equals(FiguraWGrze.PAPIER))
            return StatusGry.PRZEGRANA;
        if (user.equals(FiguraWGrze.PAPIER) && computer.equals(FiguraWGrze.KAMIEN))
            return StatusGry.WYGRANA;
        if (user.equals(FiguraWGrze.PAPIER) && computer.equals(FiguraWGrze.PAPIER))
            return StatusGry.REMIS;
        if (user.equals(FiguraWGrze.PAPIER) && computer.equals(FiguraWGrze.NOZYCE))
            return StatusGry.PRZEGRANA;
        if (user.equals(FiguraWGrze.NOZYCE) && computer.equals(FiguraWGrze.KAMIEN))
            return StatusGry.PRZEGRANA;
        if (user.equals(FiguraWGrze.NOZYCE) && computer.equals(FiguraWGrze.PAPIER))
            return StatusGry.WYGRANA;
        if (user.equals(FiguraWGrze.NOZYCE) && computer.equals(FiguraWGrze.NOZYCE))
            return StatusGry.REMIS;

        return StatusGry.REMIS;

    }

}
