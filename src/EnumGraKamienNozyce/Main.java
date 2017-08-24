package EnumGraKamienNozyce;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-08-24.
 */

public class Main {


    public enum decisionEnum {KAMIEN, NOZYCE, PAPIER}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Kamień-n Nożyce-n Papier-p Koniec-q");

        // podaje wartosci domyslne:
        decisionEnum user = decisionEnum.KAMIEN;
        decisionEnum computer = decisionEnum.NOZYCE;

        while (true) {
            System.out.println("Podaj swoj znak: ");
            String decision = sc.nextLine();
            decisionEnum userDecision;
            switch (decision.toLowerCase()) {
                case "n":
                    userDecision = decisionEnum.NOZYCE;
                    System.out.println("Wybrales Nozyce");
                    break;
                case "k":
                    userDecision = decisionEnum.KAMIEN;
                    break;
                case "p":
                    userDecision = decisionEnum.PAPIER;
                    break;
                default:
                    continue;
            }

            Random random = new Random(); // losujemy wawrtosc losowa
            decisionEnum computerDecison;
            switch (random.nextInt(3)) {
                case 0:
                    computerDecison = decisionEnum.KAMIEN;
                    System.out.println("Komputer wybral Kamien ");
                    break;
                case 1:
                    computerDecison = decisionEnum.NOZYCE;
                    System.out.println("Komputer wybral Nozyce ");
                    break;
                case 2:
                    computerDecison = decisionEnum.PAPIER;
                    System.out.println("Komputer wybral Papier");
                    break;
                default:
                    continue;
            }


        }
    }
}
