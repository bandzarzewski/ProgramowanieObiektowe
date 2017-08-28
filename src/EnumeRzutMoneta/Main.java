package EnumeRzutMoneta;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Maciek on 27.08.2017.
 */
public class Main {
    public enum Coin {HEADS, TAILS, Q}

    public enum StatusGry {TRAFILES, NIETRAFIES}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Początkowe wartości
        Coin user = Coin.HEADS;
        Coin computer = Coin.TAILS;

        int wygrana = 0;
        int przegrana = 0;
        int liczbaGier = 0;


        while (!user.equals(Coin.Q)) {
            // Losujemy
            System.out.println("Podaj swoj znak (h lub t): ");
            String decision = sc.nextLine();


            Random random = new Random();

            switch (random.nextInt(2)) {
                case 0:
                    computer = Coin.HEADS;

                    System.out.println("Computer wybrał HEADS");

                    break;
                case 1:
                    computer = Coin.TAILS;
                    System.out.println("Computer wybrał TAILS");
                    break;

            }
            switch (decision.toLowerCase()) {
                case "h":
                    user = Coin.HEADS;
                    break;
                case "t":
                    user = Coin.TAILS;
                    break;
                case "q":
                    user = Coin.Q;
                default:
                    continue;

            }

            StatusGry result = wynikiGry(user, computer);
            if (result.equals(StatusGry.TRAFILES)) {
                System.out.println("Trafiłeś !");
                wygrana++;
            } else {
                System.out.println("Nie Trafiłeś");
            }
//            System.out.println();
//            if (result.equals(StatusGry.NIETRAFIES)) ;
//
//            przegrana++;

            liczbaGier++;


        }
        System.out.println("Liczba wygranych: " + wygrana + " Liczba gier:" + liczbaGier);
    }

    public static StatusGry wynikiGry(Coin user, Coin computer) {
        if (user.equals(Coin.HEADS) && computer.equals(Coin.HEADS))
            return StatusGry.TRAFILES;
        if (user.equals(Coin.HEADS) && computer.equals(Coin.TAILS))
            return StatusGry.NIETRAFIES;
        if (user.equals(Coin.TAILS) && computer.equals(Coin.TAILS))
            return StatusGry.TRAFILES;
        if (user.equals(Coin.TAILS) && computer.equals(Coin.HEADS))
            return StatusGry.NIETRAFIES;

        return StatusGry.TRAFILES;
    }

//    public void komentarz(Coin user, Coin computer) {
//        if (user.equals(Coin.HEADS) && computer.equals(Coin.HEADS)) {
//            System.out.println("Zajebiście trafiłeś");
//        }
//    }
}
